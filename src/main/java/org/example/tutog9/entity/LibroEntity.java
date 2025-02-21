package org.example.tutog9.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "libro")
@Getter
@Setter
public class LibroEntity {
    @Id
    private String isbn;
    private String nombre;
    private LocalDate fechaPublicacion;
    private int edicion;
    private LocalDate createdAt;
    private LocalDate modifiedAt;
    private LocalDate deleteAt;
    private boolean estado;
    
    // relacion muchos a uno de libro a autor
    @ManyToOne
    @JoinColumn(name = "autor_id_fk")
    private AutorEntity autorEntity;
    
    // relacion muchos a uno con editorial
    
    @ManyToOne
    @JoinColumn(name = "editorial_id_fk")
    private EditorialEntity editorialEntity;
    
    // tarea:
    // crear el codigo necesario para poder agregar un libro
    // con su respectivo autor y editorial
    // ademas cuando se agregue un libro a un autor
    // el atributo numLibros de autor entity debe de actualizarse
}
