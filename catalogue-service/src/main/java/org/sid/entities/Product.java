package org.sid.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    @DBRef
    private Category category;
}
