package com.job.portal.JobSearch.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employe")
public class Emplye {
    @Id
    private String name;

}