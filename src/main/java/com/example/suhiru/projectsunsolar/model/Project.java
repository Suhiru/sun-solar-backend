package com.example.suhiru.projectsunsolar.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "project_details")
public class Project implements Serializable {

    //Project class to map with project details table

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_code")
    private Integer id;

    @Column(name = "c_code")
    @NotNull
    private Integer customerId;

    @Column(name = "capacity")
    private  Double capacity;

    @Column(name = "geo_location")
    private String geoLocation;

    @Column(name = "visited_by")
    private String visitedBy;

    @Column(name = "date_visited")
    private Date visitedDate;

    @Column(name = "solar_connection_type")
    private String connectionType;

    @Column(name = "grid_type")
    private String gridType;

    @Column(name = "payment_base")
    private String paymentBase;

}
