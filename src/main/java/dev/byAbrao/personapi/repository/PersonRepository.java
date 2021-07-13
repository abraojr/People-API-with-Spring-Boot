package dev.byAbrao.personapi.repository;

import dev.byAbrao.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
