package ru.foodtechlab.es.order.service.core.domain.order.usecases;

import com.rcore.domain.commons.usecase.UseCase;
import com.rcore.domain.commons.usecase.model.SingletonEntityOutputValues;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.foodtechlab.es.order.service.core.domain.order.entity.OrderEntity;
import ru.foodtechlab.es.order.service.core.domain.order.events.output.OrderDeliveryCompletedEvent;
import ru.foodtechlab.es.order.service.core.domain.order.exceptions.OrderNotFoundException;
import ru.foodtechlab.es.order.service.core.domain.order.port.OrderRepository;
import ru.foodtechlab.fdelivery.core.domain.commons.events.EventDispatcher;

/**
 * Завершение доставки заказа
 */
@RequiredArgsConstructor
public class CompleteDeliveryOrderUseCase extends UseCase<CompleteDeliveryOrderUseCase.InputValues, SingletonEntityOutputValues<OrderEntity>> {

    private final OrderRepository orderRepository;
    private final EventDispatcher eventDispatcher;

    @Override
    public SingletonEntityOutputValues<OrderEntity> execute(InputValues inputValues) {
        OrderEntity orderEntity = orderRepository.findById(inputValues.getId())
                .orElseThrow(OrderNotFoundException::new);
        orderEntity.completeDelivery();
        orderRepository.save(orderEntity);

        eventDispatcher.dispatch(OrderDeliveryCompletedEvent.of(orderEntity.getId()));

        return SingletonEntityOutputValues.of(orderEntity);
    }

    @AllArgsConstructor(staticName = "of")
    @Getter
    public static class InputValues implements UseCase.InputValues {
        private String id;
    }

}
