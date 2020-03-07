package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //given
        Person expected = new Person(24, "Greg");
        String expectedName = "Greg";
        long expectedID = 24;
        //when
        String actualName = expected.getName();
        long actualID = expected.getId();
        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testSetName() {
        //given
        Person expected = new Person(555, "Davis");
        String expectedName = "Davis";
        //when
        expected.setName("Davis");
        String actualName = expected.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }

}
