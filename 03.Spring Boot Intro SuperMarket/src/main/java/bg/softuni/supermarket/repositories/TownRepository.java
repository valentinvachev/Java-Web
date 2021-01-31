package bg.softuni.supermarket.repositories;

import bg.softuni.supermarket.models.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends JpaRepository<Town,Integer> {

}
