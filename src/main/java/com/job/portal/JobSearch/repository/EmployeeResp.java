package com.job.portal.JobSearch.repository;

import com.job.portal.JobSearch.entity.Emplye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeResp extends JpaRepository<Emplye, String> {
}
