package com.example.suhiru.projectsunsolar.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //no use of this class, just created to  test security config before creating tables

    private Integer id;
    private String name;
    private String email;
    private String password;
}
