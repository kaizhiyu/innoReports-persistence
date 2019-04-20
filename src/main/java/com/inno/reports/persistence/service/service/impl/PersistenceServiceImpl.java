package com.inno.reports.persistence.service.service.impl;

import com.inno.reports.persistence.service.model.User;
import com.inno.reports.persistence.service.repository.UserRepository;
import com.inno.reports.persistence.service.service.PersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nethmih on 20.04.19.
 */

@Service
public class PersistenceServiceImpl implements PersistenceService {

    @Autowired
    UserRepository userRepository;

/*    @Override
    public List<Entity> getAllEntities() {
        List<Entity> list = new ArrayList<>();
        entityRepository.findAll().forEach(list::add);
        return list;
    }*/

    @Override
    public User findUserById(Long eid) {
        return userRepository.findByUid(eid);
    }
}
