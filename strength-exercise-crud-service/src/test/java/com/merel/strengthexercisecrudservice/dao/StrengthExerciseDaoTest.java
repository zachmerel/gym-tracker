package com.merel.strengthexercisecrudservice.dao;

import com.merel.strengthexercisecrudservice.dto.StrengthExercise;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StrengthExerciseDaoTest {

    @Autowired
    StrengthExerciseDao strengthExerciseDao;

    @Before
    public void setUp(){
        strengthExerciseDao.findAll().forEach(x->strengthExerciseDao.deleteById(x.getExerciseId()));
    }

    @Test
    public void findStrengthExerciseByExerciseDescription(){
        //arrange
        StrengthExercise strengthExercise = new StrengthExercise();
        strengthExercise.setExerciseDescription("push up");
        strengthExercise.setFrequency(1);
        strengthExercise.setNumberOfSets(1);
        strengthExercise.setNumberOfReps(1);
        strengthExercise.setWeight(1.0);
        strengthExercise.setNotes("note");
        strengthExercise.setRestTime(1);
        strengthExercise.setToFailure(false);
        //act
        strengthExercise = strengthExerciseDao.save(strengthExercise);
        List<StrengthExercise> strengthExerciseList = new ArrayList<>();
        strengthExerciseList.add(strengthExercise);
        //assert
        assertEquals(strengthExerciseList,strengthExerciseDao.findStrengthExerciseByExerciseDescription("push up"));
    }
}


