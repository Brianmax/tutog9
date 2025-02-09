package org.example.tutog9.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "editorial")
public class EditorialEntity {
    @Id
    private String ruc;
    private String nombre;
    private LocalDate fechaFundacion;
    private LocalDate createdAt;
    private LocalDate modifiedAt;
    private LocalDate deleteAt;
    private boolean estado;
}
