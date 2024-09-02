package co.edu.uceva.demo_20242.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

/**
 * La clase Celular es una entidad que se mapea con la tabla celular en la base de datos.
 */
@Data
@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String linea;
    private String modelo;
    private int memoria;
    private int ram;
}
