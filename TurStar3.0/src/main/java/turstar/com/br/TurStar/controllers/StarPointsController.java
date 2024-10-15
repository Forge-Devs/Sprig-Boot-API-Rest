package turstar.com.br.TurStar.controllers;

import turstar.com.br.entities.StarPoints;
import turstar.com.br.services.StarPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/starpoints")
public class StarPointsController {

    @Autowired
    private StarPointsService StarPointsService;

    @PostMapping("/add")
    public StarPoints addPoints(@RequestParam Long userId, @RequestParam int points) {
        return starPointsService.addPoints(userId, points);
    }

    @GetMapping("/user/{userId}")
    public List<StarPoints> getStarPointsByUser(@PathVariable Long userId) {
        return starPointsService.getStarPointsByUser(userId);
    }
}