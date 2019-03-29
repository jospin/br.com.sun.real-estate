package br.com.sun.real.estate.services;

import br.com.sun.real.estate.model.Country;
import br.com.sun.real.estate.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by lucienj on 26/03/2019.
 */
@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public void save(Country country) {
        country.setActive(country.getActive()!=null?country.getActive():Boolean.FALSE);
        repository.save(country);
    }

    public List<Country> list() {
        return repository.findAll();
    }

    public Country find(Integer id) {
        Optional<Country> optional = repository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public void edit(Country form) {
        Country original = find(form.getId());
        original.setName(form.getName());
        original.setActive(form.getActive()!=null?form.getActive():Boolean.FALSE);
        repository.save(original);
    }

    public Boolean changeState(Integer id, Boolean status) {
        Country country = find(id);
        country.setActive(status);
        repository.save(country);
        return true;
    }

    public Boolean delete(Integer id) {
        Country country = find(id);
        repository.delete(country);
        return true;
    }

}
