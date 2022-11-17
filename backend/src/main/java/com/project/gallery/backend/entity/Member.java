package com.project.gallery.backend.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "members")
public class Member {

    @Id  // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자등 증가
    private int id;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

}