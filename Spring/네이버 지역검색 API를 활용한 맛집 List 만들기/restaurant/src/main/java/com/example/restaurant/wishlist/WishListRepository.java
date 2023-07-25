package com.example.restaurant.wishlist;

import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}


// JPA 배우고
//public class WishListRepository extends JpaRepositoryAbstract<WishListEntity> {
//}