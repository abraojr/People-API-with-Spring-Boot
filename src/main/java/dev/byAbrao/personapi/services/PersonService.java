package dev.byAbrao.personapi.services;

import dev.byAbrao.personapi.dto.request.PersonDTO;
import dev.byAbrao.personapi.dto.response.MessageResponseDTO;
import dev.byAbrao.personapi.entities.Person;
import dev.byAbrao.personapi.mapper.PersonMapper;
import dev.byAbrao.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
