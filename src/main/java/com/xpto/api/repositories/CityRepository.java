package com.xpto.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xpto.api.entities.City;

public interface CityRepository extends JpaRepository<City, Long>  {

	@Query(value = "select * from tb_city where capital = 'true'", nativeQuery = true)
    List<City> getCapitals();
}