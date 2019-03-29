package br.com.sun.real.estate.repository;

import br.com.sun.real.estate.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lucienj on 13/03/2019.
 */
public interface CityRepository extends JpaRepository<City, Integer> {
}
