package co.edu.unipiloto.controladores;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unipiloto.entidades.Reporte;
import co.edu.unipiloto.servicios.ReporteService;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {
    @Autowired
    private ReporteService reporteService;

    @PostMapping
    public ResponseEntity<Reporte> reportarUbicacion(@RequestBody Reporte reporte) {
        Reporte nuevoReporte = reporteService.reportarUbicacion(reporte);
        return ResponseEntity.ok(nuevoReporte);
    }

    @PostMapping("/entrega")
    public ResponseEntity<Void> reportarEntrega(@RequestParam Long remisionId) throws AttributeNotFoundException {
        reporteService.reportarEntrega(remisionId);
        return ResponseEntity.ok().build();
    }
}
