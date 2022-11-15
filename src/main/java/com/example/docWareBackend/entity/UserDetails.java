package com.example.docWareBackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Table(name = "USERDETAILS")

public class UserDetails {
    @Id
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
    private int id;
    private String userRoll;
}
