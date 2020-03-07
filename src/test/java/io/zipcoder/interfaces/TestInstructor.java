package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Teacher instructor = new Instructor(24,"Greg");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Person instructor = new Instructor(24,"Greg");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //given
        Student studentPerson = new Student(13, "Kaylie");
        Instructor instructorPerson = new Instructor(24, "Greg");
        //when
        instructorPerson.teach(studentPerson, 6.5);
        Double expected = 6.5;
        Double actual = studentPerson.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        //given
        Student studentKaylie = new Student(13, "Kaylie");
        Learner[] learners = new Learner[]{studentKaylie};
        Instructor instructorPerson = new Instructor(24, "Greg");
        //when
        instructorPerson.lecture(learners, 10.0);
        Double actualStudent = studentKaylie.getTotalStudyTime();
        //then
        Double expectedStudent = 10.0;
        Assert.assertEquals(expectedStudent, actualStudent);
    }
}
