package com.example.suhiru.projectsunsolar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_details")
public class Customer implements Serializable {

    //Customer class to map with customer details table

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "customer_code")
    private Integer id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "profession")
    private String profession;

    @Column(name = "referred_by")
    private String referredBy;

    @Column(name = "telephone_number")
    private String number;

    @Column(name = "email")
    private String email;

}
