package br.com.sun.real.estate.controller.admin;

import br.com.sun.real.estate.model.Country;
import br.com.sun.real.estate.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lucienj on 26/03/2019.
 */
@Controller
@RequestMapping("admin/country")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/new")
    public String newCountry(Model model) {
        return "admin/country/new";
    }

    @PostMapping("/new")
    public String newStateForm(Country state, Model model) {
        service.save(state);
        return "redirect:list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Country> countries = service.list();
        model.addAttribute("countries", countries);
        return "admin/country/list";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        Country country = service.find(id);

        model.addAttribute("country", country);
        return "admin/country/edit";
    }

    @PostMapping("/edit")
    public String editSave(Country form, Model model) {
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
