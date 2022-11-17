package com.project.gallery.backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "carts")
public class Cart {

    @Id  // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자등 증가
    private int id;

    @Column(length = 30)
    private int memberId;

    @Column
    private int itemId;

}
