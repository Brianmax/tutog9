package org.example.tutog9.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class EditorialDto {
    private String ruc;
    private String nombre;
    private LocalDate fechaFundacion;
}
