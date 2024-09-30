package com.api.example.demo_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.example.demo_api.model.Monumento;
import com.api.example.demo_api.repository.MonumentoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MonumentoService {
    
    private final MonumentoRepository repo;

    public List<Monumento> getAll() {
        return repo.findAll();
    }
    
    public void deleteMonumentoById(Long id) {
        repo.deleteById(id);
    }   
}
