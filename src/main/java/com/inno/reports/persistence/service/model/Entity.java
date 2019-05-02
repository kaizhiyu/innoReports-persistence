
package com.inno.reports.persistence.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;


/**
 * Created by nethmih on 20.04.19.
 */

@NodeEntity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entity {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long eId;

    private Long id;
    private String Name;
    private String Email;
    private String Address;
    private List<String> Tags;

    @JsonIgnore
    @Relationship(type = "BELONGS", direction = Relationship.INCOMING)
    private BelongsRelationship belongsRelationship;

}

