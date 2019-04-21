package com.inno.reports.persistence.service.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by nethmih on 20.04.19.
 */
@Getter
@Setter
public class EntityRequestDTO {
    private String name;
    private String email;
    private String address;
    private List<String> tags;
}
