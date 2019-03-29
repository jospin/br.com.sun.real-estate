package br.com.sun.real.estate.controller.admin;

import br.com.sun.real.estate.model.State;
import br.com.sun.real.estate.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lucienj on 19/03/2019.
 */
@Controller
@RequestMapping("admin/state")
public class StateController {

    @Autowired
    private StateService service;

    @GetMapping("/new")
    public String newState(Model model) {
        return "admin/state/new";
    }

    @PostMapping("/new")
    public String newStateForm(State state, Model model) {
        service.save(state);
        return "redirect:list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<State> states = service.list();
        model.addAttribute("states", states);
        return "admin/state/list";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        State state = service.find(id);

        model.addAttribute("state", state);
        return "admin/state/edit";
    }

    @PostMapping("/edit")
    public String editSave(State form, Model model) {
        service.edit(form);
        return "redirect:list";
    }

    @RequestMapping("/active/{id}")
    public @ResponseBody
    Boolean active(@PathVariable("id") Integer id, Model model) {
        return service.changeState(id, Boolean.TRUE);
    }

    @RequestMapping("/inactive/{id}")
    public @ResponseBody
    Boolean inactive(@PathVariable("id") Integer id, Model model) {
        return service.changeState(id, Boolean.FALSE);
    }

    @RequestMapping("/delete/{id}")
    public @ResponseBody
    Boolean delete(@PathVariable("id") Integer id, Model model) {
        return service.delete(id);
    }
}
