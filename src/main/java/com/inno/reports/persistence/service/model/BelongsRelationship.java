
package com.inno.reports.persistence.service.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;



/**
 * Created by nethmih on 20.04.19.
 */

@NoArgsConstructor
@AllArgsConstructor
@RelationshipEntity(type = "BELONGS")
public class BelongsRelationship {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Report report;

    @EndNode
    private Entity entity;

}

