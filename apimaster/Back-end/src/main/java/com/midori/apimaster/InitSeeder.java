package com.midori.apimaster;

import com.midori.apimaster.dao.entity.SkillsEntity;
import com.midori.apimaster.service.SkillsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class InitSeeder implements CommandLineRunner {

    private final SkillsService service;

    @Override
    public void run(String... args) throws Exception {
        log.info("Populating database...");
        SkillsEntity skill1 = SkillsEntity.builder()
                .damage(120)
                .isCC(true)
                .range(600)
                .title("Ice arrow")
                .build();
        SkillsEntity skill2 = SkillsEntity.builder()
                .damage(300)
                .isCC(false)
                .range(350)
                .title("Magic orb")
                .build();
        SkillsEntity skill3 = SkillsEntity.builder()
                .damage(800)
                .isCC(false)
                .range(50)
                .title("Hammer crush")
                .build();
        SkillsEntity skill4 = SkillsEntity.builder()
                .damage(500)
                .isCC(false)
                .range(600)
                .title("Hell flame")
                .build();
        SkillsEntity skill5 = SkillsEntity.builder()
                .damage(800)
                .isCC(false)
                .range(800)
                .title("Final blow")
                .build();
        SkillsEntity skill6 = SkillsEntity.builder()
                .damage(9999)
                .isCC(true)
                .range(5000)
                .title("Midori's monster blast")
                .build();

        log.info(service.save(skill1).getTitle() + " has been saved.");
        log.info(service.save(skill2).getTitle() + " has been saved.");
        log.info(service.save(skill3).getTitle() + " has been saved.");
        log.info(service.save(skill4).getTitle() + " has been saved.");
        log.info(service.save(skill5).getTitle() + " has been saved.");
        log.info(service.save(skill6).getTitle() + " has been saved.");

        log.info("Done.");

    }
}
