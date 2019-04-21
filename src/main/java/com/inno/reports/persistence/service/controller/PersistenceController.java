package com.inno.reports.persistence.service.controller;

import com.inno.reports.persistence.service.model.Entity;
import com.inno.reports.persistence.service.model.EntityRequestDTO;
import com.inno.reports.persistence.service.model.User;
import com.inno.reports.persistence.service.service.PersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nethmih on 20.04.19.
 */

@RestController
@RequestMapping("/persistence")
public class PersistenceController {

    @Autowired
    PersistenceService persistenceService;

    @RequestMapping(value = "/entities", method = RequestMethod.GET)
    public List<Entity> getAllEntities() {

        return persistenceService.getAllEntities();
    }

    @RequestMapping(value = "entities", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Entity postNewEntity(@RequestBody EntityRequestDTO requestDTO) {

        return persistenceService.postNewEntity(requestDTO);

    }
}
