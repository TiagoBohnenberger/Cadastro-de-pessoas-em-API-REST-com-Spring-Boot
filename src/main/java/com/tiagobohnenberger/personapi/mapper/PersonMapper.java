package com.tiagobohnenberger.personapi.mapper;

import com.tiagobohnenberger.personapi.dto.request.PersonDTO;
import com.tiagobohnenberger.personapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "birthDate", target = "birthDate")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
