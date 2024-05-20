package co.edu.unipiloto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unipiloto.entidades.Remision;
import co.edu.unipiloto.entidades.Solicitud;
import co.edu.unipiloto.servicios.RemisionService;

@RestController
@RequestMapping("/api/remisiones")
public class RemisionController {
    @Autowired
    private RemisionService remisionService;

    @PostMapping
    public ResponseEntity<Remision> generarRemision(@RequestBody Remision remision) {
        Remision nuevaRemision = remisionService.generarRemision(remision);
        return ResponseEntity.ok(nuevaRemision);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Remision> obtenerRemision(@PathVariable Long id) {
        Remision remision = remisionService.obtenerRemision(id);
        return ResponseEntity.ok(remision);
    }
}
