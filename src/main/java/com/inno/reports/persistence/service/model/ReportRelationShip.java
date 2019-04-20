package com.inno.reports.persistence.service.model;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nethmih on 20.04.19.
 */
@RelationshipEntity(type = "REPORT")
public class ReportRelationShip {

    @Id
    @GeneratedValue
    private Long id;
    private List<String> reports = new ArrayList<>();

    @StartNode
    private User user;

    @EndNode
    private Report report;

    public ReportRelationShip() {
    }

    public ReportRelationShip(User user, Report report) {
        this.user = user;
        this.report = report;
    }

    public Long getId() {
        return id;
    }

    public List<String> getReports() {
        return reports;
    }

    public User user() {
        return user;
    }

    public Report getReport() {
        return report;
    }

    public void addReports(String name) {
        if (this.reports == null) {
            this.reports = new ArrayList<>();
        }
        this.reports.add(name);
    }
}
