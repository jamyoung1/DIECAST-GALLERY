package com.project.gallery.backend.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "items")
public class Item {

    @Id  // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자등 증가
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100)
    private String imgPath;

    @Column(length = 30)
    private String price;

    @Column
    private int discount_per;


}
