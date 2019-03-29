package br.com.sun.real.estate.repository;

import br.com.sun.real.estate.model.CommercialClassification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lucienj on 15/03/2019.
 */
public interface CommercialClassificationRepository extends JpaRepository<CommercialClassification, Integer> {
}
