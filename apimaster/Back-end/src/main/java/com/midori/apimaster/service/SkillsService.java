package com.midori.apimaster.service;

import com.midori.apimaster.dao.entity.SkillsEntity;

import java.util.List;

public interface SkillsService {
    List<SkillsEntity> findAll();
    SkillsEntity save(SkillsEntity skillsEntity);
}
