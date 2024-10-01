package com.api.example.demo_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.example.demo_api.model.Monumento;

@Repository
public interface MonumentoRepository extends JpaRepository<Monumento, Long> {

}
