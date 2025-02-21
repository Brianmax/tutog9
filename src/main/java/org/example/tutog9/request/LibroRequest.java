package org.example.tutog9.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.tutog9.response.LibroResponse;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibroRequest {
    private String isbn;
    private String nombre;
    private LocalDate fechaPublicacion;
    private int edicion;
    private String rucEditorial;
    private int idAutor;
}
