package com.example.docWareBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Table(name = "USER")
public class User {
    @Id
//    @OneToMany(mappedBy = "user")
//    private Set<UserDetails> userDetails;
    private int id;
    private String name;
    private String password;
}
