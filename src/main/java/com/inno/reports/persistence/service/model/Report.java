package com.inno.reports.persistence.service.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Relationship;


/**
 * Created by nethmih on 20.04.19.
 */
public class Report {

    @Id
    @GeneratedValue
    private Long rid;
    private String tag;

    @Relationship(type = "REPORT", direction = Relationship.INCOMING)
    private ReportRelationShip reportRelationShip;

/*    @Relationship(type = "BELONG")
    private Entity entity;*/

    public Report() {
    }

    public Report(String tag) {
        this.tag = tag;
    }

    public Long getRid() {
        return rid;
    }

    public String getTag() {
        return tag;
    }


/*    public Entity getEntity() {
        return entity;
    }

    public void addEntity(Entity entity) {
      this.entity = entity;
    }*/
}
