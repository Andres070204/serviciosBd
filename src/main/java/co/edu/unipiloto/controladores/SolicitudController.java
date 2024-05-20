package co.edu.unipiloto.controladores;



import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unipiloto.entidades.Solicitud;
import co.edu.unipiloto.servicios.SolicitudService;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;

    @PostMapping
    public ResponseEntity<Solicitud> crearSolicitud(@RequestBody Solicitud solicitud) {
        Solicitud nuevaSolicitud = solicitudService.crearSolicitud(solicitud);
        return ResponseEntity.ok(nuevaSolicitud);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Solicitud> obtenerSolicitud(@PathVariable Long id) throws AttributeNotFoundException {
        Solicitud solicitud = solicitudService.obtenerSolicitud(id);
        return ResponseEntity.ok(solicitud);
    }
}
