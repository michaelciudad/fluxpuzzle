package cl.duoc.fluxpuzzle.Model;


import jakarta.persistence.*;
import java.time.LocalDate;

public class Usuarios {


    private int id_usuario;
    private String nom_usuario;
    private String correo;
    private String contraseña;
    private LocalDate fecha_registro;
    private nivel _actual;
    
}
