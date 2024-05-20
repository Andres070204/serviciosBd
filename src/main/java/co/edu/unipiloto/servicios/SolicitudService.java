package co.edu.unipiloto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unipiloto.controladores.repositorios.PropietarioRepository;
import co.edu.unipiloto.controladores.repositorios.SolicitudRepository;
import co.edu.unipiloto.entidades.*;

import java.util.List;

import javax.management.AttributeNotFoundException;

@Service
public class SolicitudService {
    @Autowired
    private SolicitudRepository solicitudRepository;

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Autowired
    private NotificacionService notificacionService;

    @Transactional
    public Solicitud crearSolicitud(Solicitud solicitud) {
        Solicitud nuevaSolicitud = solicitudRepository.save(solicitud);

        //List<Propietario> propietariosCercanos = propietarioRepository
           // .findPropietariosCercanosYDisponibles(solicitud.getOrigen(), solicitud.getVolumen());

        //notificacionService.notificarPropietarios(propietariosCercanos, nuevaSolicitud);

        return nuevaSolicitud;
    }

    @Transactional(readOnly = true)
    public Solicitud obtenerSolicitud(Long id) throws AttributeNotFoundException {
        return solicitudRepository.findById(id)
            .orElseThrow(() -> new AttributeNotFoundException("Solicitud no encontrada"));
    }
}
