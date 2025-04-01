package com.ecommerce.service;

import com.ecommerce.payload.CartDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
    List<CartDTO> getAllCarts();
    CartDTO getCart(String emailId, Long cartId);
    @Transactional
    CartDTO updateProductQuantityInCart(Long productId, Integer quantity);
    String deleteProductFromCart(Long cartId, Long productId);
    void updateProductInCarts(Long cartId, Long productId);
}
