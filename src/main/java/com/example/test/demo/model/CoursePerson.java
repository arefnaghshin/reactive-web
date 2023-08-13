package com.example.test.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "course_person")
public class CoursePerson {

    @Column("course_id")
    private Integer personId;

    @Column("person_id")
    private Integer courseId;
}
