package com.tapia.mspizzeria.repository;

import com.tapia.mspizzeria.model.Pizzeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {

}

