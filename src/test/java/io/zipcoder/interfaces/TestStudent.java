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
        Student student = new Student(24,"Greg");
        student.learn(20.0);
        Double afterStudy = student.getTotalStudyTime();
        Double expected = 20.0;

        Assert.assertEquals(expected,afterStudy);
    }
}
