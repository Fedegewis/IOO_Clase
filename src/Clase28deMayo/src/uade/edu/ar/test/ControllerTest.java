package Clase28deMayo.src.uade.edu.ar.test;


import Clase28deMayo.src.uade.edu.ar.controller.Controller;
import Clase28deMayo.src.uade.edu.ar.dto.ModelDto;
import Clase28deMayo.src.uade.edu.ar.model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class ControllerTest {

    Controller controller;

    @BeforeEach
    public void init() throws Exception {
        controller = Controller.getInstances();
    }

    @Test
    void getInstances() throws Exception {
        assertNotNull(controller);
    }

    @Test
    void addModel() throws Exception {

        Model model = new Model(String.valueOf(Math.random()+4),"name");
        controller.addModel(controller.toDto(model));
    }

    @Test
    void getByIdModel() {
    }

    @Test
    void getAllModel() throws Exception {
        List<ModelDto> list = controller.getAll();
        assertNotEquals(0,list.size());
    }

    @Test
    void deleteByIdModel() {
    }
}