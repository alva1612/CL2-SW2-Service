package com.cibertec.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_viajes")
@Data
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viaje")
    private int idViaje;
    private String placa;
    @Column(name = "cantidad_boletos")
    private int cantidadBoletos;
    private double precio;
}
