package turstar.com.br.TurStar.Entities;

import javax.persistence.*;

@Entity
public class TouristSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean visited;

}
