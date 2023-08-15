package com.example.test.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "person")
public class Person {
    @Id
    @Column("id")
    private Integer id;

    @Column("name")
    private String personName;
}
