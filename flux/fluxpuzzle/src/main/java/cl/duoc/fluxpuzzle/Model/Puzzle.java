package cl.duoc.fluxpuzzle.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Puzzle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int id_nivel; 
    private String nombre_nivel;
    private int dificultad;
    private int timpo_limite;
    private String imagenUrl;
    private int puntaje_maximo;
    @OneToOne
    private Usuarios creador;
    
}
                
