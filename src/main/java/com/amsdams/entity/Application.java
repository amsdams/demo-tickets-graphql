package com.amsdams.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Application {

    public Application(String name2, String owner2, String description2) {
		this.name = name2;
		this.owner = owner2;
		this.description = description2;
				
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="application_id")
    private Long id;

    @Column(name = "app_name", nullable = false)
    private String name;

    @Column(length = 2000)
    private String description;
    private String owner;

    
}
