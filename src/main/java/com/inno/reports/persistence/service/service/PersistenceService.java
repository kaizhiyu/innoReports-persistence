package com.inno.reports.persistence.service.service;

//import com.inno.reports.persistence.service.model.Entity;
import com.inno.reports.persistence.service.model.User;

import java.util.List;

/**
 * Created by nethmih on 20.04.19.
 */
public interface PersistenceService {

/*    List<Entity> getAllEntities();

    Entity findEntityById(Long eid);*/

    User findUserById(Long eid);
}
