package com.inno.reports.persistence.service.controller;

import com.inno.reports.persistence.service.model.User;
import com.inno.reports.persistence.service.service.PersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public User getAll() {

        return persistenceService.findUserById((long) 1);
    }
}
