package com.cibertec.dao;

import com.cibertec.entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Integer> {
    public List<Viaje> findByPrecioGreaterThanEqualAndPrecioLessThanEqual(Double start, Double end);
}