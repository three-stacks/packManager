package io.threestacks.packerapi.agenda;

//import javax.persistence.Entity;

import java.io.Serializable;

//@Entity
public class Agenda implements Serializable {


    private String id;
    private String name;
    private String agenda;

    public Agenda(){

    }
    public Agenda(String id, String name, String agenda, Boolean complete) {
        this.id = id;
        this.name = name;
        this.agenda = agenda;
        this.complete = complete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    private Boolean complete;

}

