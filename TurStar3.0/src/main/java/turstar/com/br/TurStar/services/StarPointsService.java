package turstar.com.br.TurStar.services;

import com.seuprojeto.entities.StarPoints;
import com.seuprojeto.entities.User;
import com.seuprojeto.repositories.StarPointsRepository;
import com.seuprojeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarPointsService {

    @Autowired
    private StarPointsRepository starPointsRepository;

    @Autowired
    private UserRepository userRepository;

    public StarPoints addPoints(Long userId, int points) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        StarPoints starPoints = new StarPoints();
        starPoints.setUser(user);
        starPoints.setPoints(points);
        return starPointsRepository.save(starPoints);
    }

    public List<StarPoints> getStarPointsByUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return starPointsRepository.findByUser(user);
    }
}