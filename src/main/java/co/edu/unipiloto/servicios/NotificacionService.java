package co.edu.unipiloto.servicios;


import org.springframework.stereotype.Service;

import co.edu.unipiloto.entidades.Propietario;
import co.edu.unipiloto.entidades.Solicitud;

import java.util.List;
import java.util.logging.Logger;

@Service
public class NotificacionService {

    private static final Logger logger = Logger.getLogger(NotificacionService.class.getName());

    public void notificarPropietarios(List<Propietario> propietarios, Solicitud solicitud) {
        for (Propietario propietario : propietarios) {
            logger.info(String.format("Notificando a %s sobre nueva solicitud: %s", propietario.getNombre(), solicitud.toString()));
        }
    }

    public void notificarPropietarioAsignado(Propietario propietario, Solicitud solicitud) {
        logger.info(String.format("Notificando a %s sobre solicitud asignada con ID: %d, Detalles: %s", propietario.getNombre(), solicitud.getId(), solicitud.toString()));
    }
}
