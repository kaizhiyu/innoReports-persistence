
package com.inno.reports.persistence.service.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;


/**
 * Created by nethmih on 20.04.19.
 */

@NodeEntity
public class Entity {

    @Id
    @GeneratedValue
    private Long eid;
    private String tag;

    @Relationship(type = "BELONG", direction = Relationship.INCOMING)
    private BelongRelationship belongRelationship;

    public Entity() {
    }

    public Entity(String tag) {
        this.tag = tag;
    }
}

