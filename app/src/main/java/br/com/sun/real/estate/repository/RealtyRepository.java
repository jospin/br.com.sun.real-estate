package br.com.sun.real.estate.repository;

import br.com.sun.real.estate.model.Realty;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lucienj on 13/03/2019.
 */
public interface RealtyRepository extends JpaRepository<Realty, Integer> {
}
