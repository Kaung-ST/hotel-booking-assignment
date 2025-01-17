package com.example.hotelbookingassignment.ds;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.UUID;

@Entity
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(unique = true)
    private String name;
    private String section;

    public Room(String name, String section) {
        this.name = name;
        this.section = section;
    }
}
