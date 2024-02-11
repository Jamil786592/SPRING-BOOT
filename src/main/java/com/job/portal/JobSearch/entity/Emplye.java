package com.job.portal.JobSearch.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "employe")
@Data
@Setter
@Getter
public class Emplye {
    @Id
    private String name;

}