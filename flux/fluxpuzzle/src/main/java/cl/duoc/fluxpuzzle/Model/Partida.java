package cl.duoc.fluxpuzzle.Model;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "partidas")
@Data
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación: Muchas partidas pueden pertenecer a UN usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuario;

    // Relación: Muchas partidas pueden ser del mismo nivel (Puzzle)
    @ManyToOne
    @JoinColumn(name = "puzzle_id")
    private Puzzle puzzle;

    private int movimientos;
    private long tiempoSegundos;
    private String estado; // "EN_PROGRESO", "GANADA", "ABANDONADA"
    
    private LocalDateTime fechaInicio = LocalDateTime.now();
}
