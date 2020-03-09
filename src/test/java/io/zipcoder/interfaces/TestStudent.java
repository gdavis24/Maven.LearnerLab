package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Learner student = new Student(24,"Greg");

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Person student = new Student(24,"Greg");

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student studentPerson = new Student(24,"Greg");
        studentPerson.learn(20.0);
        Double afterStudy = studentPerson.getTotalStudyTime();
        Double expected = 20.0;

        Assert.assertEquals(expected,afterStudy);
    }
}
