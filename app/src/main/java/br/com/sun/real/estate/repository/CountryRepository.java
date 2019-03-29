package br.com.sun.real.estate.repository;

import br.com.sun.real.estate.model.Country;
import br.com.sun.real.estate.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by lucienj on 13/03/2019.
 */
public interface CountryRepository extends JpaRepository<Country, Integer> {
    Optional<Country> findById(Integer id);
}
