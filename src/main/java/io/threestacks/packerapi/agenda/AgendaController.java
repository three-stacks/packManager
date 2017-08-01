package io.threestacks.packerapi.agenda;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @RequestMapping("/agendas")
    public List <Agenda> getAllAgendas(){
        return agendaService.getAllAgendas();
    }

    @RequestMapping("/agendas/{id}")
    public Agenda getAgenda(@PathVariable String id){
        return agendaService.getAgenda(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/agendas")
    public  void addAgenda(@RequestBody Agenda agenda){
        agendaService.addAgenda(agenda);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/agendas/{id}")
    public void updateAgenda(@RequestBody Agenda agenda, @PathVariable String id){
        agendaService.updateAgenda(id, agenda);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/agendas/{id}")
    public void deleteAgenda(@PathVariable String id){
        agendaService.deleteAgenda(id);
    }
}
