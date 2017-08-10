package io.threestacks.packerapi.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<Agenda> getAllAgendas(){
        List<Agenda> agendas = new ArrayList<>();
        agendaRepository.findAll().forEach(agendas::add);
        return agendas;
    }

    public List<Agenda> getUserAgendas(long userId){
        List<Agenda> agendas = new ArrayList<>();
        agendaRepository.findByUserId(userId).forEach(agendas::add);
        return agendas;
    }

    public Agenda getAgenda(long id) {
        return agendaRepository.findOne(id);
    }

    public Agenda addAgenda(Agenda agenda){
        agendaRepository.save(agenda);
        return agenda;
    }

    public Agenda updateAgenda(long id, Agenda agenda){
        Agenda agendaFound = agendaRepository.findOne(id);
        agendaRepository.save(agenda);
        return agendaFound;
    }

    public void deleteAgenda(long id){
        agendaRepository.delete(id);
    }
}
