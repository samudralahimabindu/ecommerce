package com.ecom.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "PRODUCT")
@SequenceGenerator(name = "PRODUCT_SEQ_ID", sequenceName = "SEQ_PRODUCT", allocationSize = 1)
public class Product implements Serializable {

    @Column @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ_ID")
    private Long id;

    @Column
    private String productName;

    @Column
    private String productType;
    @Column
    private String createdBy;
    @Column
    Date createdAt;
    @Column
    private String updatedBy;
    @Column
    Date updatedAt;
}
