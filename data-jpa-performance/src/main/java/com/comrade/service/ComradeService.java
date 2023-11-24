package com.comrade.service;

import com.comrade.entity.ComradeEntity;
import com.comrade.repository.ComradeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ComradeService {
    private final ComradeRepository comradeRepository;

    public ComradeService(ComradeRepository comradeRepository) {
        this.comradeRepository = comradeRepository;
    }
    public void replicateData(List<ComradeEntity> comradeEntities) {
        comradeRepository.saveAll(comradeEntities);
    }
}
