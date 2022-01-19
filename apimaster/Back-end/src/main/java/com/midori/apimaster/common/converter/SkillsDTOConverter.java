package com.midori.apimaster.common.converter;

import com.midori.apimaster.common.DTO.SkillsDTO;
import com.midori.apimaster.dao.entity.SkillsEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SkillsDTOConverter {

    public List<SkillsDTO> fromListEntityToListDTO(List<SkillsEntity> skillsEntityList) {
        return skillsEntityList.stream()
                .map(this::fromEntityToDTO)
                .collect(Collectors.toList());
    }

    public SkillsDTO fromEntityToDTO(SkillsEntity skillsEntity) {
        return SkillsDTO.builder()
                .id(skillsEntity.getId())
                .damage(skillsEntity.getDamage())
                .range(skillsEntity.getRange())
                .isCC(skillsEntity.getIsCC())
                .title(skillsEntity.getTitle())
                .build();
    }

}
