package com.inno.reports.persistence.service.controller;

import com.inno.reports.persistence.service.model.Entity;
import com.inno.reports.persistence.service.model.EntityRequestDTO;
import com.inno.reports.persistence.service.service.PersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping(value = "/entities")
    public List<Entity> getAllEntitiesWithTags() {

        return persistenceService.getAllEntities();
    }

    @PostMapping(value = "entities", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Entity postNewEntity(@RequestBody EntityRequestDTO requestDTO) {

        return persistenceService.postNewEntity(requestDTO);

    }
}
