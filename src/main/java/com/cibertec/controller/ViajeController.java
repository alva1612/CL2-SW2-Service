package com.cibertec.controller;

import com.cibertec.entity.Viaje;
import com.cibertec.impl.ViajeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8092"})
@RequestMapping("/viajes")
public class ViajeController {

    @Autowired
    private ViajeImpl serviceViaje;

    @GetMapping("/listar")
    public @ResponseBody List<Viaje> listar() throws  Exception {
        return  serviceViaje.list();
    }

    @PostMapping("/registrar")
    public  @ResponseBody Viaje register(@RequestBody Viaje v) throws  Exception {
        return  serviceViaje.register(v);
    }

    @GetMapping("/buscar")
    public  @ResponseBody List<Viaje> buscar(
            @RequestParam(value = "start") String start,
            @RequestParam(value = "end")  String end) throws Exception {
        Double parsedStart = Double.parseDouble(start);
        Double parsedEnd = Double.parseDouble(end);
        return serviceViaje.search(parsedStart, parsedEnd);
    }
}
