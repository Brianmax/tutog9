package org.example.tutog9.service.impl;

import lombok.AllArgsConstructor;
import org.example.tutog9.entity.AutorEntity;
import org.example.tutog9.repository.AutorRepository;
import org.example.tutog9.request.AutorRequest;
import org.example.tutog9.response.AutorResponse;
import org.example.tutog9.service.AutorService;
import org.springframework.expression.spel.ast.OpOr;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AutorServiceImpl implements AutorService {
    
    private AutorRepository autorRepository;
    @Override
    public AutorResponse createAutor(AutorRequest autorRequest) {
        // validations

        AutorEntity autorEntity = new AutorEntity();
        autorEntity.setNombre(autorRequest.getNombre());
        autorEntity.setApellido(autorRequest.getApellido());
        autorEntity.setEdad(autorRequest.getEdad());
        //
        autorEntity.setNumLibros(0);
        autorEntity.setCreatedAt(LocalDate.now());
        autorEntity.setModifiedAt(null);
        autorEntity.setDeleteAt(null);
        autorEntity.setEstado(true);
        autorRepository.save(autorEntity);
        
        return new AutorResponse(
                autorEntity.getId(),
                autorEntity.getNombre(),
                autorEntity.getApellido(),
                autorEntity.getNumLibros());
    }

    @Override
    public AutorResponse findById(int id) {
        Optional<AutorEntity> autorEntityOptional = autorRepository.findById(id);
        if (autorEntityOptional.isEmpty()) {
            return null;
        }

        AutorEntity autorEntity = autorEntityOptional.get();
        return new AutorResponse(
                autorEntity.getId(),
                autorEntity.getNombre(),
                autorEntity.getApellido(),
                autorEntity.getNumLibros()
        );
    }
}
