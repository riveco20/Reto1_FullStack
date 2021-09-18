package com.solucion.crudReto.repository;

import com.solucion.crudReto.entity.TodoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InterfaceTodoListRepository extends CrudRepository<TodoList, Integer> {

}
