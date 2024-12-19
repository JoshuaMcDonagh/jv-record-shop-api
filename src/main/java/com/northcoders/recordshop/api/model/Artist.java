package com.northcoders.recordshop.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name="artists")
@Data
public class Artist {

    @Id
    @GeneratedValue(strategy=IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy="artists")
    private ArrayList<Album> album = new ArrayList<>();

}
