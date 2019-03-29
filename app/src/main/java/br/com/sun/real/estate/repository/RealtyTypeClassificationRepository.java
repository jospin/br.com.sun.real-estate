package br.com.sun.real.estate.repository;

import br.com.sun.real.estate.model.RealtyTypeClassification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lucienj on 18/03/2019.
 */
public interface RealtyTypeClassificationRepository extends JpaRepository<RealtyTypeClassification, Integer> {
}
