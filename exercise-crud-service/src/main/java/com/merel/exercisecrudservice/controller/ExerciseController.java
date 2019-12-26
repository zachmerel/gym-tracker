package com.merel.exercisecrudservice.controller;

import com.merel.exercisecrudservice.dao.ExerciseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseDao exerciseDao;

    @RequestMapping(value = "/exercise", method = RequestMethod.POST)


    @RequestMapping(value = "/exercise/{description}" , method = RequestMethod.PUT)

    @RequestMapping(value = "/product", method = RequestMethod.GET)

    @RequestMapping(value = "/product{description}", method = RequestMethod.GET)


    @RequestMapping(value = "/product/{description}", method = RequestMethod.DELETE)

}
