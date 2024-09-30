package com.api.example.demo_api.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codigoPais;
    private String nombrePais;
    private String nombreCiudad;
    private double latitud;
    private double longitud;
    private String nombreMonumento;
    private String descripcion;
    private String urlFoto;
}