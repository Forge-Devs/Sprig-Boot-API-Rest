package turstar.com.br.TurStar.controllers;

import com.seuprojeto.entities.TouristSpot;
import com.seuprojeto.services.TouristSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/touristspots")
public class TouristSpotController {

    @Autowired
    private TouristSpotService touristSpotService;

    @GetMapping
    public List<TouristSpot> getAllTouristSpots() {
        return touristSpotService.getAllTouristSpots();
    }

    @PutMapping("/{id}/visit")
    public TouristSpot markAsVisited(@PathVariable Long id) {
        return touristSpotService.markAsVisited(id);
    }
}
