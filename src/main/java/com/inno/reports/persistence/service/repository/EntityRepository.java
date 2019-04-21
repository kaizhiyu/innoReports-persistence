package com.inno.reports.persistence.service.repository;

import com.inno.reports.persistence.service.model.Entity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Created by nethmih on 20.04.19.
 */


@RepositoryRestResource(collectionResourceRel = "Entity", path = "Entity")
public interface EntityRepository extends Neo4jRepository<Entity, Long> {

    Entity findByEId(@Param("eid") Long eid);
}

