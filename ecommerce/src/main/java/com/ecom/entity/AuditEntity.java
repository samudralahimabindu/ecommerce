package com.ecom.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class AuditEntity {

    @Column(name = "CREATED_BY", updatable = false, nullable = false)
    String createdBy;
    @Column(name = "CREATED_AT", updatable = false, nullable = false)
    Date createdAt;
    @Column(name = "UPDATED_BY", updatable = false, nullable = false)
    String updatedBy;
    @Column(name = "UPDATED_AT", updatable = false, nullable = false)
    Date updatedAt;
}
