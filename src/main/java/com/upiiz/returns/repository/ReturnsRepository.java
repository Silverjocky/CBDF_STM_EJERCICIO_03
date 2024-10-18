package com.upiiz.returns.repository;

import com.upiiz.returns.model.Return;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@Repository
public class ReturnsRepository {
    private List<Return> returns = new ArrayList<Return>();
    private AtomicLong id = new AtomicLong();

    public Return guardar(Return return1) {
        return1.setReturn_id(id.incrementAndGet());
        returns.add(return1);
        return return1;
    }

    // GET - Todas las returns
    public List<Return> obtenerTodas() {
        return returns;
    }

    // GET solo una return
    public Return obtenerPorId(Long id) {
        // Forma estructurada
        /*
        for (Return c : returns) {
            if (c.getReturn_id().equals(id)) {
                return c;
            }
        }
         */
        // Forma funcional
        return returns.stream().filter(return1 -> return1.getReturn_id().equals(id)).findFirst().orElse(null);
        //return null;
    }

    // DELETE
    public void eliminar(Long id) {
        returns.removeIf(return1 -> return1.getReturn_id().equals(id));
    }

    // PUT
    public Return actualizar(Return return1) {
        eliminar(return1.getReturn_id());
        returns.add(return1);
        return return1;
    }



}
