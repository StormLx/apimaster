package com.midori.apimaster.common.DTO;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Builder
@Data
public class SkillsDTO {
    protected Long id;
    protected String title;
    protected Boolean isCC;
    protected Integer damage;
    protected Integer range;
}
