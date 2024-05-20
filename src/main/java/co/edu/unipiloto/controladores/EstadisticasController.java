package co.edu.unipiloto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unipiloto.servicios.EstadisticasService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class EstadisticasController {

    @Autowired
    private EstadisticasService estadisticasService;

    
}
