package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @TableGenerator(name = "key_generator", table = "key_generator",
        pkColumnName = "key_name",
        pkColumnValue = "product_value",
        valueColumnName = "key_value")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")
    private Integer id;
    private String name;

    //GenerationType.TABLE
    //here another table called "key_generator" is created for the id genetion. two columns are created, these two column's names are customizable. using the table method.
    // sequence_name is an hibernate specified name, it can be called anything else. e.g key_name, set as PK and NN, Varchar type
    //next_val is also an hibernate specified name, it can be called anything else. e.g key_val: this stores the range in which the value of the next id will be, INT type
    // in orger to customize, we must inform hibernate using the @TableGenerator annotation

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
