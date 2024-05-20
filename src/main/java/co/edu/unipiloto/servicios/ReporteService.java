package co.edu.unipiloto.servicios;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unipiloto.controladores.repositorios.RemisionRepository;
import co.edu.unipiloto.controladores.repositorios.ReporteRepository;
import co.edu.unipiloto.entidades.*;

@Service
public class ReporteService {
    @Autowired
    private ReporteRepository reporteRepository;

    @Autowired
    private RemisionRepository remisionRepository;

    @Transactional
    public Reporte reportarUbicacion(Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    @Transactional
    public void reportarEntrega(Long remisionId) throws AttributeNotFoundException {
        Remision remision = remisionRepository.findById(remisionId)
            .orElseThrow(() -> new AttributeNotFoundException("Remisión no encontrada"));
        
        remision.setEstado("COMPLETADA");
        remisionRepository.save(remision);
    }
}
