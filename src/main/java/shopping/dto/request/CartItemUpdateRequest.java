package shopping.dto.request;

public class CartItemUpdateRequest {

    private int quantity;

    protected CartItemUpdateRequest() {
    }

    public CartItemUpdateRequest(final int quantity) {
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }
}
