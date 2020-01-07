package com.merel.strengthexercisecrudservice.controller;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.merel.strengthexercisecrudservice.dao.StrengthExerciseDao;
import com.merel.strengthexercisecrudservice.dto.StrengthExercise;
import com.merel.strengthexercisecrudservice.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
public class StrengthExerciseController {

    @Autowired
    private StrengthExerciseDao strengthExerciseDao;

    //CREATE
    @RequestMapping(value = "/strengthExercise", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public StrengthExercise createStrengthExercise(@RequestBody @Valid StrengthExercise strengthExercise) {
        return strengthExerciseDao.save(strengthExercise);
    }

    //UPDATE BY ID
    @RequestMapping(value = "/strengthExercise/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public StrengthExercise updateConsoleById(@PathVariable int id, @RequestBody @Valid StrengthExercise strengthExercise) {
        if (id != strengthExercise.getExerciseId()) {
            throw new IllegalArgumentException("The id in the path does not equal the id in the request body");
        }
        for (StrengthExercise strengthExercise1 : strengthExerciseDao.findAll()) {
            if (id == strengthExercise1.getExerciseId()) {
                strengthExercise.setExerciseId(id);
                strengthExerciseDao.save(strengthExercise);
            }
        }
        return strengthExerciseDao.getOne(id);
    }

    //FIND BY ID
    @RequestMapping(value = "/strengthExercise/id/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public StrengthExercise findStrengthExerciseById(@PathVariable int id) throws JsonMappingException {
        Optional<StrengthExercise> strengthExercise = strengthExerciseDao.findById(id);
        if (strengthExercise.isPresent()) {
            return strengthExercise.get();
        } else {
            throw new NotFoundException("Did not find an strength exercise with id " + id);
        }
    }

//    FIND BY DESCRIPTION
    @RequestMapping(value = "/strengthExercise/description/{description}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<StrengthExercise> findStrengthExerciseByDescription(@PathVariable("description") String exerciseDescription) throws IllegalArgumentException  {
        try {
            return strengthExerciseDao.findStrengthExerciseByExerciseDescription(exerciseDescription);
        }catch (NullPointerException n) {
            throw new IllegalArgumentException("no valid description of " + exerciseDescription);
        }
    }

    //FIND ALL
    @RequestMapping(value = "/strengthExercise", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<StrengthExercise> getStrengthExercises() {
        return strengthExerciseDao.findAll();
    }

    @RequestMapping(value = "/strengthExercise/{id}", method = RequestMethod.DELETE)
    public void deleteLevelUpById(@PathVariable int id) throws Exception {
        Optional<StrengthExercise> strengthExercise = strengthExerciseDao.findById(id);
        if (strengthExercise.isPresent()) {
            strengthExerciseDao.deleteById(id);
        } else {
            throw new NotFoundException("Did not find an levelUp with id " + id);
        }
    }
}