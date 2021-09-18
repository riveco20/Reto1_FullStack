package com.solucion.crudReto.entity;

public class ToDoObject {

    private Integer listid;
    private Integer id;
    private String name;
    private boolean isCompleted;


    public ToDoObject(Integer listid, Integer id, String name, boolean isCompleted) {
        this.listid = listid;
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
