package com.cibertec.impl;

import com.cibertec.dao.ViajeRepository;
import com.cibertec.entity.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ViajeImpl extends  ICRUDImpl<Viaje, Integer> {

    @Autowired
    private ViajeRepository repo;
    @Override
    public JpaRepository<Viaje, Integer> getRepository() {
        return repo;
    }

    public List<Viaje> search(Double start, Double end) throws Exception {
        return repo.findByPrecioGreaterThanEqualAndPrecioLessThanEqual(start, end);
    }
}
