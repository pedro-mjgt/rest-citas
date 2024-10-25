package com.example.rest_citas.controller;

import com.example.rest_citas.model.Cita;
import com.example.rest_citas.service.ICitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/cita")
public class CitaController {

    private final ICitaService citaService;

    @PostMapping
    public ResponseEntity<Cita> registrarCita(@RequestBody Cita cita) {
        return new ResponseEntity<>(citaService.guardarCita(cita),
                HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cita> cancelarCita(@PathVariable Integer id) {
        citaService.cancelarCita(id);
        return ResponseEntity.noContent().build();
    }

}
