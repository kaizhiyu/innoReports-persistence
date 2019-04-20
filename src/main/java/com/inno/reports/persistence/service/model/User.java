package com.inno.reports.persistence.service.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nethmih on 20.04.19.
 */

@NodeEntity
public class User {
    @Id
    @GeneratedValue
    private Long uid;
    private String Name;

    @Relationship(type = "REPORT")
    private List<Report> reports = new ArrayList<>();

    public User() {
    }

    public User(String Name) {
        this.Name = Name;
    }

    public Long getUid() {
        return uid;
    }

    public String getName() {
        return Name;
    }

    public List<Report> getReports() {
        return reports;
    }
}
