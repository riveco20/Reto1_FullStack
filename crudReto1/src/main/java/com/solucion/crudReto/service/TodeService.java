package com.solucion.crudReto.service;

import com.solucion.crudReto.entity.ToDoObject;
import com.solucion.crudReto.entity.Todo;
import com.solucion.crudReto.entity.TodoList;
import com.solucion.crudReto.exception.ExceptionWriting;
import com.solucion.crudReto.repository.InterfaceTodoListRepository;
import com.solucion.crudReto.repository.InterfaceTodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Optional;
import java.util.Set;

@Service
public class TodeService implements InterfaceServicioTodo{


    @Autowired
    private InterfaceTodoRepository data;
    private InterfaceTodoListRepository data2;

    @Override
    public Iterable<Todo> listar() {

        return data.findAll();
    }

    @Override
    public Todo listarId(int id)  {
        Optional<Todo> td = data.findById(id);
        return td.get();

    };

    @Override
    public Todo save(Todo todo) {

        if(todo ==null){
            System.out.println("No se ha agregado una tarea");
        }

         return data.save(todo);
    }

    @Override
    public void delete(int id) {
        Optional<Todo> td = data.findById(id);
        if(td.isEmpty()){
            System.out.println("El objeto no exite");
        }

        data.delete(td.get());

    }

    @Override
    public Todo upgrade(Todo todo) {
        Optional<Todo> td = data.findById(todo.getId());
        if(td.isEmpty()){
            System.out.println("La persona con el id: " + todo.getId() + "No existe");
        }

        return todo;
    }

    @Override
    public Todo get(Integer id) {
        return data.findById(id).orElseThrow();
    }

    @Override
    public Set<ToDoObject> getlistId(int id) {
        Optional<TodoList> tdlis = data2.findById(id);
        if(tdlis.isEmpty()) {
            ExceptionWriting exceptio1 = new ExceptionWriting("El objeto no existe");
            System.out.println(exceptio1);
                 }
        return (Set<ToDoObject>) tdlis.get();
    }




}

