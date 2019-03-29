package br.com.sun.real.estate.repository;

import br.com.sun.real.estate.model.Localization;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lucienj on 18/03/2019.
 */
public interface LocalizationRepository extends JpaRepository<Localization, Integer> {
}
