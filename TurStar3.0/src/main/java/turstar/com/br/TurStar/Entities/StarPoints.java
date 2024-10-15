package turstar.com.br.TurStar.Entities;

import javax.persistence.*;

@Entity
public class StarPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int points;

    @ManyToOne
    private User user;

}
