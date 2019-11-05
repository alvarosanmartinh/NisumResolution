package com.nisum.challenge.rest;

import com.nisum.challenge.persistence.pojo.PersonaInfo;
import com.nisum.challenge.persistence.repositories.PersonaInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/persona")
public class PersonaInfoController {

    @Autowired
    PersonaInfoRepository personaInfoRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<PersonaInfo> findById(@RequestParam(value="id") Integer id) {
        return ResponseEntity.ok(personaInfoRepository.findById(id).orElse(new PersonaInfo()));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<PersonaInfo>> findAll() {
        return ResponseEntity.ok((List<PersonaInfo>) personaInfoRepository.findAll());
    }

    @RequestMapping(value = "/save", method = {RequestMethod.PUT, RequestMethod.POST})
    public ResponseEntity<PersonaInfo> save(@Valid @RequestBody PersonaInfo personaInfo) {
        return ResponseEntity.ok(personaInfoRepository.save(personaInfo));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam(value="id") Integer id) {
        personaInfoRepository.deleteById(id);
    }
}
