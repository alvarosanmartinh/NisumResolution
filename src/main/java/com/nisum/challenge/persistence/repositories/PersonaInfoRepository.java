package com.nisum.challenge.persistence.repositories;

import com.nisum.challenge.persistence.pojo.PersonaInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaInfoRepository extends CrudRepository<PersonaInfo, Integer> {
}
