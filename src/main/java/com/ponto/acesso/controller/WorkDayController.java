package com.ponto.acesso.controller;

import com.ponto.acesso.model.WorkDay;
import com.ponto.acesso.service.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/jornada")
public class WorkDayController {

    @Autowired
    private WorkDayService workDayService;

    public WorkDayController(WorkDayService workDayService) {
        this.workDayService = workDayService;
    }

    @PostMapping
    public WorkDay createWork(@RequestBody WorkDay workDay) {
        return workDayService.createWork(workDay);
    }

    @GetMapping("/listar")
    public List<WorkDay> getWorkList(){
        return workDayService.getWorkList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkDay> getWorkByID(@PathVariable("id") Long id) throws Exception {
        return  ResponseEntity.ok(workDayService.getJWorkByID(id)
                .orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public WorkDay updateWork(@RequestBody WorkDay workDay){
        return workDayService.updateWork(workDay);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteWorkByID(@PathVariable("id") Long id) throws Exception {
        try {
            workDayService.deleteWorkByID(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkDay>) ResponseEntity.ok();
    }
}
