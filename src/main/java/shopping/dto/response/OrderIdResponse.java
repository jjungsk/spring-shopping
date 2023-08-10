package shopping.dto.response;

public class OrderIdResponse {

    private final Long orderId;

    public OrderIdResponse(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }
}
