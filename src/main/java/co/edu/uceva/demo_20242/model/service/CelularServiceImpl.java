package co.edu.uceva.demo_20242.model.service;

import co.edu.uceva.demo_20242.model.dao.CelularDao;
import co.edu.uceva.demo_20242.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Esta clase implementa los metodos de la interfaz ICelularService y se encarga de realizar
 * las operaciones CRUD de la entidad Celular
 */
@Service
public class CelularServiceImpl implements ICelularService{
    @Autowired
    CelularDao celularDao;

    /**
     * Este metodo se encarga de listar los celulares
     */
    @Override
    public List<Celular> listar() {
        return (List<Celular>) celularDao.findAll();
    }

    /**
     * Este metodo se encarga de eliminar un celular
     */
    @Override
    public void delete(Celular celular) {
        celularDao.delete(celular);
    }

    /**
     * Este metodo se encarga de guardar un celular
     y retorna el objeto guardado incluyendo el id
     */
    @Override
    public Celular save(Celular celular) {
        return celularDao.save(celular);
    }

    /**
     * Este metodo se encarga de buscar un celular por su id
     */
    @Override
    public Celular findById(Long id) {
        return celularDao.findById(id).orElse(null);
    }

    /**
     * Este metodo se encarga de actualizar un celular
     */
    @Override
    public Celular update(Celular celular) {
        return celularDao.save(celular);
    }
}
