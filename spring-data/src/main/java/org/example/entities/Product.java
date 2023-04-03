package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")
    private Integer id;
    private String name;

    //here another table called "key_generator" is created for the id genetion. two columns are created
    // one called sequence_name, set as PK and NN, Varchar type
    //the other called next_val : this store the range in which the value of the next id will be
    // INT type

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
