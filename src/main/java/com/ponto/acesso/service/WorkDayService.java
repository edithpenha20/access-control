package com.ponto.acesso.service;

import com.ponto.acesso.model.WorkDay;
import com.ponto.acesso.repository.WorkDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkDayService {

    private WorkDayRepository workDayRepository;

    @Autowired
    public WorkDayService(WorkDayRepository workDayRepository) {
        this.workDayRepository = workDayRepository;
    }


    public WorkDay createWork(WorkDay workDay) {
        return workDayRepository.save(workDay);
    }

    public List<WorkDay> getWorkList() {
        return workDayRepository.findAll();
    }

    public Optional<WorkDay> getJWorkByID(Long idJornada) {
        return workDayRepository.findById(idJornada);
    }

    public WorkDay updateWork(WorkDay workDay) {
        return workDayRepository.save(workDay);
    }

    public void deleteWorkByID(Long idJornada) {
        workDayRepository.deleteById(idJornada);
    }
}
