package com.github.gerabtc.citiesapi.countries.repositories;

import com.github.gerabtc.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
