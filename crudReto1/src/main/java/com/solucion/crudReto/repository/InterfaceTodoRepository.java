package com.solucion.crudReto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.solucion.crudReto.entity.Todo;

@Repository
public interface InterfaceTodoRepository extends CrudRepository<Todo,Integer> {


}
