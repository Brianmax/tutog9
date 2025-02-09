package org.example.tutog9.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "autor")
@Getter
@Setter
public class AutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int numLibros;
    private LocalDate createdAt;
    private LocalDate modifiedAt;
    private LocalDate deleteAt;
    private boolean estado;
}
