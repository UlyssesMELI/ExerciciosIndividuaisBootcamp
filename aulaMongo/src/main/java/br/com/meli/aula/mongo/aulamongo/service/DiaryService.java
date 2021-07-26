package br.com.meli.aula.mongo.aulamongo.service;

import br.com.meli.aula.mongo.aulamongo.model.Diary;
import br.com.meli.aula.mongo.aulamongo.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryService {

    private DiaryRepository diaryRepository;

    @Autowired
    DiaryService(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    public void insert(Diary diary){
        this.diaryRepository.insert(diary);
    }

}
