package com.inno.reports.persistence.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;


/**
 * Created by nethmih on 20.04.19.
 */

@NodeEntity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Report {

    @Id
    @GeneratedValue
    private Long rid;
    private String tag;

    @Relationship(type = "report", direction = Relationship.INCOMING)
    private ReportRelationShip reportRelationShip;

/*    @Relationship(type = "BELONG")
    private Entity entity;*/

/*    public Report() {
    }

    public Report(String tag) {
        this.tag = tag;
    }

    public Long getRid() {
        return rid;
    }

    public String getTag() {
        return tag;
    }*/


/*    public Entity getEntity() {
        return entity;
    }

    public void addEntity(Entity entity) {
      this.entity = entity;
    }*/
}
