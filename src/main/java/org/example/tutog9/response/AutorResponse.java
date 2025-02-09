package org.example.tutog9.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AutorResponse {
    private int id;
    private String nombre;
    private String apellido;
    private int numLibros;
}
