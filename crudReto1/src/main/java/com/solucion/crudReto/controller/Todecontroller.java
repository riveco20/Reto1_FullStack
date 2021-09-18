package com.solucion.crudReto.controller;

import com.solucion.crudReto.entity.Todo;
import com.solucion.crudReto.service.InterfaceServicioTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api")
public class Todecontroller {

    @Autowired
    private InterfaceServicioTodo servicio;

    @GetMapping(value = "listTodo")
    public Iterable<Todo>listTodo() {

        return servicio.listar();
    };

    @PostMapping(value = "saveTodo")
    public Todo saveTodo(@RequestBody Todo todo){

        return servicio.save(todo);
    };

    @DeleteMapping(value ="delete")
    public void delete(@PathVariable("id") Integer id ){
        servicio.delete(id);

    };

    @GetMapping(value="Obtener")
    public Todo get(@PathVariable("id") Integer id){
        return servicio.get(id);
    };

}
