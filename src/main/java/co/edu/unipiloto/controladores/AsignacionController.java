package co.edu.unipiloto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unipiloto.servicios.AsignacionService;

@RestController
@RequestMapping("/api/asignaciones")
public class AsignacionController {
    @Autowired
    private AsignacionService asignacionService;

    @PostMapping
    public ResponseEntity<Void> asignarSolicitud(@RequestParam Long solicitudId, @RequestParam Long propietarioId) throws Exception {
        asignacionService.asignarSolicitud(solicitudId, propietarioId);
        return ResponseEntity.ok().build();
    }
}
