package com.example.rest_citas.service;

import com.example.rest_citas.model.Cita;

public interface ICitaService {

    Cita guardarCita(Cita cita);
    Cita obtenerCitaPorId(Integer id);
    void cancelarCita(Integer id);

}
