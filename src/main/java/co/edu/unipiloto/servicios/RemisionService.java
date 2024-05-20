package co.edu.unipiloto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unipiloto.controladores.repositorios.RemisionRepository;
import co.edu.unipiloto.entidades.*;

import java.sql.Timestamp;

@Service
public class RemisionService {
    @Autowired
    private RemisionRepository remisionRepository;

    @Transactional
    public Remision generarRemision(Remision remision2) {
        Remision remision = new Remision();
        remision.setSolicitudId(remision2.getId());
        remision.setFechaHoraRecogida(new Timestamp(System.currentTimeMillis()));
        remision.setOrigen(remision2.getOrigen());
        remision.setDestino(remision2.getDestino());
        remision.setPlacaCamion("POR_DEFINIR");
        remision.setConductor("POR_DEFINIR");
        remision.setRuta("POR_DEFINIR");
        remision.setUnidadesCarga(1);
        remision.setVolumenTotal(remision2.getVolumenTotal());
        remision.setPesoTotal(remision2.getPesoTotal());
        remision.setCuidadosEspeciales(remision2.getCuidadosEspeciales());
        remision.setEstado("EN_TRANSITO");
        return remisionRepository.save(remision);
    }

    @Transactional(readOnly = true)
    public Remision obtenerRemision(Long id) {
        return remisionRepository.findById(id)
            .orElseThrow();
    }
}
