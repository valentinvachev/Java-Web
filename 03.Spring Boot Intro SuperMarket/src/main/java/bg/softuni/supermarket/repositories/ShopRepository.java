package bg.softuni.supermarket.repositories;

import bg.softuni.supermarket.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop,Integer> {
}
