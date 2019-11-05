package com.nisum.challenge.rest;

import com.nisum.challenge.persistence.pojo.PersonaInfo;
import com.nisum.challenge.persistence.repositories.PersonaInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/persona")
public class PersonaInfoController {

    @Autowired
    PersonaInfoRepository personaInfoRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public PersonaInfo findById(@RequestParam(value="id") Integer id) {
        return personaInfoRepository.findById(id).orElse(new PersonaInfo());
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<PersonaInfo> findAll() {
        return (List<PersonaInfo>) personaInfoRepository.findAll();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public List<PersonaInfo> update(@RequestBody PersonaInfo personaInfo) {
        return (List<PersonaInfo>) personaInfoRepository.save(personaInfo);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam(value="id") Integer id) {
        personaInfoRepository.deleteById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody PersonaInfo personaInfo) {
        personaInfoRepository.save(personaInfo);
    }
}
