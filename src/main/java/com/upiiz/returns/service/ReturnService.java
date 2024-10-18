package com.upiiz.returns.service;

import com.upiiz.returns.model.Return;
import com.upiiz.returns.repository.ReturnsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnService {
    // Requerimos el REPO (Datos - Listado) - Categorías
    // Requiero "INYECTAR" el servicio

    ReturnsRepository returnsRepository;

    // Constructor - Cuando crea la instancia le pasa el repositorio
    public ReturnService(ReturnsRepository returnsRepository) {
        this.returnsRepository = returnsRepository;
    }

    // GET - Todas
    public List<Return> getAllReturns() {
        return returnsRepository.obtenerTodas();
    }

    // GET - Categoría por ID
    public Return getReturnById(Long id) {
        return returnsRepository.obtenerPorId(id);
    }

    // POST - Crea categorias
    public Return createReturn(Return categoria) {
        return returnsRepository.guardar(categoria);
    }

    // PUT - Actuaizar categoria
    public Return updateReturn(Return categoria) {
        return returnsRepository.actualizar(categoria);
    }

    // DELETE - Eliminar categoria
    public void deleteReturn(Long id) {
        returnsRepository.eliminar(id);
    }

}
