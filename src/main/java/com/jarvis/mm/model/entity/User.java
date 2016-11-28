package com.jarvis.mm.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "user")
@Access(AccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class User extends BaseDomain {
    @Id
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_email", columnDefinition = " default 'null' ")
    private String userEmail;
}
