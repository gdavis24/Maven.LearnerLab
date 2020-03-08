package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E> {
    List<E> personList = new ArrayList<E>();

    public void add(E personToAdd){
        personList.add(personToAdd);
    }

    public Person findById(long id){
        return null;
    }

    public Boolean contains(Person person){
        if (personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(id);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public Integer count(){
        return personList.size();
    }

    public Array[] toArray(){
        return null;
    }

    public Iterator iterator(){
        return null;
    }
}
