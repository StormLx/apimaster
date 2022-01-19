package com.midori.apimaster.service;

import com.midori.apimaster.dao.entity.SkillsEntity;
import com.midori.apimaster.dao.repository.SkillsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillsServiceImpl implements SkillsService {

    private final SkillsRepository skillsRepository;

    @Override
    public List<SkillsEntity> findAll() {
        return skillsRepository.findAll();
    }

    @Override
    public SkillsEntity save(SkillsEntity skillsEntity) {
        return skillsRepository.save(skillsEntity);
    }
}
