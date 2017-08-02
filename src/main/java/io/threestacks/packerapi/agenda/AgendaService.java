package io.threestacks.packerapi.agenda;

import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@Service
public class AgendaService {

    private List<Agenda> agendas = new ArrayList<>(Arrays.asList(
            new Agenda("passport", "passport stuff", "passport description", true),
                new Agenda("flight", "flight stuff", "flight description", false),
                new Agenda("house", "house stuff", "house description", true)
                ));

    public List<Agenda> getAllAgendas(){
        return agendas;
    }

    public Agenda getAgenda(String id){
        return agendas.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addAgenda(Agenda agenda){
        agendas.add(agenda);
    }

    public void updateAgenda(String id, Agenda agenda){
        for(int i = 0; i < agendas.size(); i++){
            Agenda t = agendas.get(i);
            if(t.getId().equals(id)){
                agendas.set(i, agenda);
                return;
            }
        }
    }
    public void deleteAgenda(String id){

        agendas.removeIf(t -> t.getId().equals(id));
    }
}
