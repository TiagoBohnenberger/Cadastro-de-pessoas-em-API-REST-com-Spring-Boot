package com.tiagobohnenberger.personapi.repositories;

import com.tiagobohnenberger.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
