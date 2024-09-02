package co.edu.uceva.demo_20242.controller;

import co.edu.uceva.demo_20242.model.entities.Celular;
import co.edu.uceva.demo_20242.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase es el controlador de la entidad Celular y se encarga de exponer los servicios rest de la entidad Celular para realizar las operaciones CRUD
 * de la entidad.
 */
@RestController
@RequestMapping("/api/v1/celular-service")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService;


    @GetMapping("/celulares")
    public List<Celular> listar() {
        return this.celularService.listar();
    }

    @GetMapping("/celulares/{id}")
    public Celular buscarCelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @PutMapping("/celular")
    public Celular actualizarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @DeleteMapping("/celulares/{id}")
    public void eliminarCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id);
        this.celularService.delete(celular);
    }
}
