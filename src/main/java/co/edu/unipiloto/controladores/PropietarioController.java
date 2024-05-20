package co.edu.unipiloto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unipiloto.entidades.Aplicacion;
import co.edu.unipiloto.servicios.PropietarioService;

@RestController
@RequestMapping("/aplicaciones")
public class PropietarioController {
    @Autowired
    private PropietarioService propietarioService;

    @PostMapping
    public ResponseEntity<Aplicacion> aplicarASolicitud(@RequestBody Aplicacion aplicacion) throws Exception {
        Aplicacion nuevaAplicacion = propietarioService.aplicarASolicitud(aplicacion);
        return new ResponseEntity<>(nuevaAplicacion, HttpStatus.CREATED);
    }
}
