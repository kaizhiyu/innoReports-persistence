
package com.inno.reports.persistence.service.model;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.StartNode;



/**
 * Created by nethmih on 20.04.19.
 */

public class BelongRelationship {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Report report;

    @EndNode
    private Entity entity;

    public BelongRelationship() {
    }

    public BelongRelationship(Report report, Entity entity) {
        this.report = report;
        this.entity = entity;
    }

}

