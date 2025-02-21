package org.example.tutog9.service.impl;

import org.example.tutog9.entity.EditorialEntity;
import org.example.tutog9.repository.EditorialRepository;
import org.example.tutog9.request.EditorialDto;
import org.example.tutog9.service.EditorialService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EditorialServiceImpl implements EditorialService {
    private EditorialRepository editorialRepository;
    
    public EditorialServiceImpl(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }
    @Override
    public EditorialDto createEditorial(EditorialDto editorialDto) {
        EditorialEntity editorialEntity = new EditorialEntity();
        
        editorialEntity.setRuc(editorialDto.getRuc());
        editorialEntity.setNombre(editorialDto.getNombre());
        editorialEntity.setFechaFundacion(editorialDto.getFechaFundacion());
        
        editorialEntity.setCreatedAt(LocalDate.now());
        editorialEntity.setEstado(true);
        
        editorialRepository.save(editorialEntity);
        
        return new EditorialDto(
                editorialEntity.getRuc(),
                editorialEntity.getNombre(),
                editorialEntity.getFechaFundacion());
    }
}
