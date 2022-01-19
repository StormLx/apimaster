package com.midori.apimaster.api;

import com.midori.apimaster.common.DTO.ResponseDTO;
import com.midori.apimaster.common.converter.SkillsDTOConverter;
import com.midori.apimaster.service.SkillsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/skills")
public class SkillsRS {

    /**
     * Skill service.
     */
    private final SkillsService service;

    /**
     * Skill DTO converter.
     */
    private final SkillsDTOConverter converter;

    /**
     * Return the list of all skills.
     * @return response DTO
     */
    @GetMapping("/all")
    public ResponseEntity<ResponseDTO> getAllSkills(){
        log.info("Fetching all skills from database.");
        return ResponseEntity.ok(
                ResponseDTO.builder()
                        .timestamp(LocalDateTime.now())
                        .data(Map.of("skillList", converter.fromListEntityToListDTO(service.findAll())))
                        .message("Liste des compétences récupérée.")
                        .build()
        );
    }
}
