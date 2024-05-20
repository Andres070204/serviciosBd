package co.edu.unipiloto.servicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unipiloto.controladores.repositorios.RemisionRepository;
import co.edu.unipiloto.controladores.repositorios.ReporteRepository;


@Service
public class EstadisticasService {
    @Autowired
    private RemisionRepository remisionRepository;

    @Autowired
    private ReporteRepository reporteUbicacionRepository;

}