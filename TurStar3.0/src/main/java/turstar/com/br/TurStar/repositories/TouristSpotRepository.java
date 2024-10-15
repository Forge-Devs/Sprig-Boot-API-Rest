package turstar.com.br.TurStar.repositories;

import com.seuprojeto.entities.TouristSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristSpotRepository extends JpaRepository<TouristSpot, Long> {
}
