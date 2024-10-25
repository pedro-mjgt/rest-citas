package com.example.rest_citas.service.imp;

import com.example.rest_citas.model.Cita;
import com.example.rest_citas.repository.CitaRepository;
import com.example.rest_citas.service.ICitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CitaService implements ICitaService {

    private final CitaRepository citaRepository;

    @Override
    public Cita guardarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public Cita obtenerCitaPorId(Integer id) {
        return citaRepository.findById(id).orElse(null);
    }

    @Override
    public void cancelarCita(Integer id) {
        Cita cita = obtenerCitaPorId(id);
        cita.setEstado("Cancelada");
        citaRepository.save(cita);
    }

}
