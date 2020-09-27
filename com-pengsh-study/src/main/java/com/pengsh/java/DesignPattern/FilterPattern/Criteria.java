package com.pengsh.java.DesignPattern.FilterPattern;

import java.util.List;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public interface Criteria {
     List<Person> meetCriteria(List<Person> persons);
}
