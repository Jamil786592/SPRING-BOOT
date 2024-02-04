/*
package com.job.portal.JobSearch.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;
    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    @Column(name = "email")
    public String email;
    @Column(name = "mobile_number")
    public String mobileNumber;
    @Column(name = "experience_status")
    @ElementCollection(targetClass = String.class)
    public List<String> experienceStatus;
    //base64encoded data
    @Column(name = "resume_doc")
    public byte[] resumeDoc;
    @Column(name = "create_at")
    @CreationTimestamp
    private Date createAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date UpdatedAt;
}
*/
