package com.project.gallery.backend.repository;

import com.project.gallery.backend.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findByMemberId(int memberId);

    // 사용자의 아이디 값, 아이템의 아이디 값이 있으면 카트 정보를 가져온다.
    Cart findByMemberIdAndItemId(int memberId, int itemId);

    // 사용자의 장바구니를 비운다(구매 완료 했을 때)
    void deleteByMemberId(int memberId);
}
