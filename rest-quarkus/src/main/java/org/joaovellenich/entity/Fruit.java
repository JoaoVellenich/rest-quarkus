package org.joaovellenich.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Fruit extends PanacheEntity {
    public String name;
    public int quantity;
}
