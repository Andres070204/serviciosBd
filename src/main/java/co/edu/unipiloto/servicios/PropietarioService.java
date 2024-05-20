package co.edu.unipiloto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unipiloto.controladores.repositorios.AplicacionRepository;
import co.edu.unipiloto.controladores.repositorios.SolicitudRepository;
import co.edu.unipiloto.entidades.*;

import java.util.List;

import javax.management.AttributeNotFoundException;

@Service
public class PropietarioService {
    @Autowired
    private SolicitudRepository solicitudRepository;

    @Autowired
    private AplicacionRepository aplicacionRepository;

    @Transactional(readOnly = true)
    public List<Solicitud> consultarSolicitudesDisponibles() {
        return solicitudRepository.findByEstado("PENDIENTE");
    }

    @Transactional
    public Aplicacion aplicarASolicitud(Aplicacion aplicacion) throws Exception {
        Solicitud solicitud = solicitudRepository.findById(aplicacion.getSolicitudId())
            .orElseThrow(() -> new AttributeNotFoundException("Solicitud no encontrada"));

        if (!solicitud.getEstado().equals("PENDIENTE")) {
            throw new Exception("No se puede aplicar a una solicitud no pendiente");
        }

        return aplicacionRepository.save(aplicacion);
    }
}
