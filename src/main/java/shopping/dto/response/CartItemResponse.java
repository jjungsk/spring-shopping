package shopping.dto.response;

import shopping.domain.entity.CartItemEntity;

public class CartItemResponse {

    private Long cartItemId;
    private String name;
    private String imageFileName;
    private int price;
    private int quantity;

    public CartItemResponse() {
    }

    private CartItemResponse(final Long cartItemId, final String name,
        final String imageFileName, final int price,
        final int quantity) {
        this.cartItemId = cartItemId;
        this.name = name;
        this.imageFileName = imageFileName;
        this.price = price;
        this.quantity = quantity;
    }

    public static CartItemResponse from(CartItemEntity cartItem) {
        return new CartItemResponse(
            cartItem.getId(),
            cartItem.getProduct().getName(),
            cartItem.getProduct().getImageFileName(),
            cartItem.getProduct().getPrice(),
            cartItem.getQuantity()
        );
    }

    public Long getCartItemId() {
        return cartItemId;
    }

    public String getName() {
        return name;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
