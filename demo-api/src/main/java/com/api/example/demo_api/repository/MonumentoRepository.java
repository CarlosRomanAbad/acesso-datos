package com.api.example.demo_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.example.demo_api.model.Monumento;

public interface MonumentoRepository extends JpaRepository<Monumento, Long> {

}
