package com.pengsh.java.DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
