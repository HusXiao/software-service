package org.example.service;
import java.util.List;
import org.example.po.Cart;
import org.springframework.stereotype.Service;

@Service
public interface CartService {
 public List<Cart> listCart(Cart cart);
 public int saveCart(Cart cart);
 public int updateCart(Cart cart);
 public int removeCart(Cart cart);
}
