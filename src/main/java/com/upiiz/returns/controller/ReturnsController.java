package com.upiiz.returns.controller;


import com.upiiz.returns.model.Return;
import com.upiiz.returns.service.ReturnService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/returns")
@RestController
public class ReturnsController {

    // Requiero INYECTAR el servicio
    ReturnService returnsService;

    public ReturnsController(ReturnService returnsService) {
        this.returnsService = returnsService;
    }

    // GET - Todas las returns
    @GetMapping
    public ResponseEntity<List<Return>> getReturns() {
        return ResponseEntity.ok(returnsService.getAllReturns());
    }

    // GET - Solo una returns
    @GetMapping("/{id}")
    public ResponseEntity<Return> getReturn(@PathVariable Long id) {
        return ResponseEntity.ok(returnsService.getReturnById(id));
    }

    // POST - Crear una categoria
    @PostMapping
    public ResponseEntity<Return> addReturn(@RequestBody Return categoria) {
        return ResponseEntity.ok(returnsService.createReturn(categoria));
    }

    // PUT - Actualizar una categoria
    @PutMapping("/{id}")
    public ResponseEntity<Return> updateReturn(@RequestBody Return categoria, @PathVariable Long id) {
        categoria.setReturn_id(id);
        return ResponseEntity.ok(returnsService.updateReturn(categoria));
    }

    // DELETE - Eliminar una categoria por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReturn(@PathVariable Long id) {
        returnsService.deleteReturn(id);
        return ResponseEntity.noContent().build();
    }
}