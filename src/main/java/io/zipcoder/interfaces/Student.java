package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private Double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
        totalStudyTime = 0.0;
    }

    public void learn(Double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
