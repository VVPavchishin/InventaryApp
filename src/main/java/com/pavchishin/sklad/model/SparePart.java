package com.pavchishin.sklad.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class SparePart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String partBarcode;
    private String partNumber;
    private String partName;
    private double partQuantity;
    private double partQuantityFact;
    private String partLocation;
}
