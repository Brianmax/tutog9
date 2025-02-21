package org.example.tutog9.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibroResponse {
    private String isbn;
    private String nombre;
    private LocalDate fechaPublicacion;
    private int edicion;
    private String autor;
    private String editorial;
}
