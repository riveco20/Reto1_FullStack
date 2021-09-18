package com.solucion.crudReto.service;

import com.solucion.crudReto.entity.ToDoObject;
import com.solucion.crudReto.entity.Todo;

import java.util.*;

public interface InterfaceServicioTodo {

    public Iterable<Todo> listar();
    public Todo listarId(int id);
    public Todo save(Todo todo);
    public void delete(int id);
    public Todo upgrade(Todo todo);
    public Todo get(Integer id);
    public Set<ToDoObject>getlistId(int id);

}
