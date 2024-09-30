package com.api.example.demo_api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.example.demo_api.model.Monumento;
import com.api.example.demo_api.repository.MonumentoRepository;
import com.api.example.demo_api.service.MonumentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/monumentos")
@RequiredArgsConstructor
public class MonumentoController {
    
    private final MonumentoRepository monumentoRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Monumento>> getMonumentos(){

        if(monumentoRepository.findAll().isEmpty()){
            return ResponseEntity.noContent().build();
        }

        else{
            return ResponseEntity.ok(monumentoRepository.findAll());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMonumento(@PathVariable Long id) {
        if(monumentoRepository.existsById(id)){
            monumentoRepository.deleteById(id);

        }
        
            return ResponseEntity.notFound().build();
        

    }
}