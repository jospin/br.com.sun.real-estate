package br.com.sun.real.estate.services;

import br.com.sun.real.estate.model.City;
import br.com.sun.real.estate.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by lucienj on 26/03/2019.
 */
@Service
public class CityService {
    @Autowired
    private CityRepository repository;

    public void save(City city) {
        city.setActive(city.getActive()!=null?city.getActive():Boolean.FALSE);
        repository.save(city);
    }

    public List<City> list() {
        return repository.findAll();
    }

    public City find(Integer id) {
        Optional<City> optional = repository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public void edit(City form) {
        City original = find(form.getId());
        original.setName(form.getName());
        original.setActive(form.getActive()!=null?form.getActive():Boolean.FALSE);
        repository.save(original);
    }

    public Boolean changeState(Integer id, Boolean status) {
        City city = find(id);
        city.setActive(status);
        repository.save(city);
        return true;
    }

    public Boolean delete(Integer id) {
        City city = find(id);
        repository.delete(city);
        return true;
    }
}
