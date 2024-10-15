package turstar.com.br.TurStar.repositories;

import com.seuprojeto.entities.StarPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarPointsRepository extends JpaRepository<StarPoints, Long> {
}