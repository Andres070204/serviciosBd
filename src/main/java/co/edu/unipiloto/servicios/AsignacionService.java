package co.edu.unipiloto.servicios;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unipiloto.controladores.repositorios.PropietarioRepository;
import co.edu.unipiloto.controladores.repositorios.SolicitudRepository;
import co.edu.unipiloto.entidades.*;

@Service
public class AsignacionService {
    @Autowired
    private SolicitudRepository solicitudRepository;

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Autowired
    private RemisionService remisionService;

    @Autowired
    private NotificacionService notificacionService;

    @Transactional
    public void asignarSolicitud(Long solicitudId, Long propietarioId) throws Exception {
        Solicitud solicitud = solicitudRepository.findById(solicitudId)
            .orElseThrow(() -> new AttributeNotFoundException("Solicitud no encontrada"));
        
        Propietario propietario = propietarioRepository.findById(propietarioId)
            .orElseThrow(() -> new AttributeNotFoundException("Propietario no encontrado"));

        if (!solicitud.getEstado().equals("PENDIENTE")) {
            throw new Exception("No se puede asignar una solicitud no pendiente");
        }

        solicitud.setEstado("ASIGNADA");
        solicitud.setPropietarioId(propietarioId);
        solicitudRepository.save(solicitud);

        remisionService.obtenerRemision(solicitudId);

        notificacionService.notificarPropietarioAsignado(propietario, solicitud);
    }
}
