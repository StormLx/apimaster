package com.midori.apimaster.dao.entity;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Skills")
public class SkillsEntity {

    private final static String SEQUENCE_NAME = "SKILL_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
    @SequenceGenerator(sequenceName = SEQUENCE_NAME, name = SEQUENCE_NAME, allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "IS_CC")
    private Boolean isCC;

    @Column(name = "DAMAGE")
    private Integer damage;

    @Column(name = "RANGE")
    private Integer range;

}
