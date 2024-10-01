package com.api.example.demo_api.controller;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.example.demo_api.model.Monumento;
import com.api.example.demo_api.repository.MonumentoRepository;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/monumentos")
@RequiredArgsConstructor
public class MonumentoController {
    
    private final MonumentoRepository monumentoRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Monumento>> getMonumentos(){
        List<Monumento> monumentos = monumentoRepository.findAll();
        if (monumentos.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(monumentos);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMonumento(@PathVariable Long id) {
        if (monumentoRepository.existsById(id)) {
            monumentoRepository.deleteById(id);
            
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build(); 
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monumento> getById(@PathVariable Long id) {
        
        Monumento monumento = monumentoRepository.findById(id).orElse(null);

        return monumento != null ? ResponseEntity.ok(monumento) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

    @PostMapping("/add")
    public ResponseEntity<Monumento> addMonumento(@RequestBody Monumento monumento) {
        Monumento newMonumento = monumentoRepository.save(monumento);
        return ResponseEntity.ok(newMonumento);
    }

}
    
