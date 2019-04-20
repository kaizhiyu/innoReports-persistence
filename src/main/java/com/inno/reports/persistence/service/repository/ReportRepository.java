package com.inno.reports.persistence.service.repository;

import com.inno.reports.persistence.service.model.Report;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by nethmih on 20.04.19.
 */

@RepositoryRestResource(collectionResourceRel = "Report", path = "Report")
public interface ReportRepository extends Neo4jRepository<Report, Long> {
}
