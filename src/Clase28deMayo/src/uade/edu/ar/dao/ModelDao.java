package Clase28deMayo.src.uade.edu.ar.dao;

import Clase28deMayo.src.uade.edu.ar.model.Model;
import Clase28deMayo.src.uade.edu.ar.util.GenericDAO;

public class ModelDao extends GenericDAO<Model> {

    public ModelDao(Class<Model> clase, String file) throws Exception {
        super(clase, file);
    }
}
