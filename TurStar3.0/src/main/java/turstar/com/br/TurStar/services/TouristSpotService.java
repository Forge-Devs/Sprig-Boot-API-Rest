package turstar.com.br.TurStar.services;

import com.seuprojeto.entities.TouristSpot;
import com.seuprojeto.repositories.TouristSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristSpotService {

    @Autowired
    private TouristSpotRepository touristSpotRepository;

    public List<TouristSpot> getAllTouristSpots() {
        return touristSpotRepository.findAll();
    }

    public TouristSpot markAsVisited(Long id) {
        TouristSpot spot = touristSpotRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ponto turístico não encontrado"));
        spot.setVisited(true);
        return touristSpotRepository.save(spot);
    }
}