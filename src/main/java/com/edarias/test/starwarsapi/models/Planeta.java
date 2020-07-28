package com.edarias.test.starwarsapi.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "planeta")
public class Planeta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    private String name;
    private String climate;
    private String terrain;
    private Integer films;

}