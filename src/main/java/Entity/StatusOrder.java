package Entity;

public enum StatusOrder {
    PENDING,    // в ожидании. Заказ создан, но не оплачен или готов к выполнению.
    PROCESSING, // в обработке. Заказ создан и оплачен, но не выполнен.
    CANCELED,   // отменен. Заказ отменен и не подлежит выполнению.
    COMPLETED,  // выполнен. Все позиции заказа выполнены.
    ERROR       // ошибка. C заказом возникла проблема.
}
