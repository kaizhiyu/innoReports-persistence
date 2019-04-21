package com.inno.reports.persistence.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

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

   // @Relationship(type = "report", direction = Relationship.INCOMING)
   // private ReportRelationShip reportRelationShip;

}
