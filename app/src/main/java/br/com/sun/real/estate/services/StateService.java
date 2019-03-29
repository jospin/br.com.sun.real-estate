package br.com.sun.real.estate.services;

import br.com.sun.real.estate.model.State;
import br.com.sun.real.estate.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * Created by lucienj on 26/03/2019.
 */
@Service
public class StateService {

    @Autowired
    private StateRepository repository;

    public void save(State state) {
        state.setActive(state.getActive()!=null?state.getActive():Boolean.FALSE);
        repository.save(state);
    }

    public List<State> list() {
        return repository.findAll();
    }

    public State find(Integer id) {
        Optional<State> optional = repository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }
    public void edit(State form) {
        State original = find(form.getId());
        original.setName(form.getName());
        original.setActive(form.getActive()!=null?form.getActive():Boolean.FALSE);
        original.setUf(form.getUf());
        repository.save(original);
    }

    public Boolean changeState(Integer id, Boolean status) {
        State state = find(id);
        state.setActive(status);
        repository.save(state);
        return true;
    }

    public Boolean delete(Integer id) {
        State state = find(id);
        repository.delete(state);
        return true;
    }
}
