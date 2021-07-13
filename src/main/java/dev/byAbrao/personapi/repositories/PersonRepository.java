package dev.byAbrao.personapi.repositories;

import dev.byAbrao.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
