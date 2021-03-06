package com.github.gerabtc.citiesapi.states.repositories;

import com.github.gerabtc.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
