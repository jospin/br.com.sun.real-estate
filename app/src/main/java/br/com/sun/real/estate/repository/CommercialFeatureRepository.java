package br.com.sun.real.estate.repository;

import br.com.sun.real.estate.model.CommercialFeature;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lucienj on 15/03/2019.
 */
public interface CommercialFeatureRepository extends JpaRepository<CommercialFeature, Integer> {
}
