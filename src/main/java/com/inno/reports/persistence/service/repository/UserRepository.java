package com.inno.reports.persistence.service.repository;

import com.inno.reports.persistence.service.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by nethmih on 20.04.19.
 */

@RepositoryRestResource(collectionResourceRel = "User", path = "User")
public interface UserRepository extends Neo4jRepository<User, Long> {

    User findByUid(@Param("uid") Long uid);
}
