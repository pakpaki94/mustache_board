package com.yh.board.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BoardEntity {

    // Primary key
    @Id
    @GeneratedValue
    private Integer idx;

    @Column
    private String subject;

    @Column
    private int cnt;

}
