package br.com.sun.real.estate.controller.admin;

import br.com.sun.real.estate.model.City;
import br.com.sun.real.estate.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lucienj on 26/03/2019.
 */
@Controller
@RequestMapping("admin/city")
public class CityController {
    @Autowired
    private CityService service;

    @GetMapping("/new")
    public String newState(Model model) {
        return "admin/city/new";
    }

    @PostMapping("/new")
    public String newStateForm(City city, Model model) {
        service.save(city);
        return "redirect:list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<City> cities = service.list();
        model.addAttribute("cities", cities);
        return "admin/city/list";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        City city = service.find(id);

        model.addAttribute("city", city);
        return "admin/city/edit";
    }

    @PostMapping("/edit")
    public String editSave(City form, Model model) {
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
