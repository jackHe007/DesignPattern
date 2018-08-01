package com.jackie.designpattern.demo.iterator;

import com.jackie.designpattern.demo.bean.Student;

import java.util.List;

/**
 * @author heting
 * @date 2018/8/1
 * @since JDK1.8
 * <p>
 * 功能说明:
 */
public interface StudentListIterator {

    void next();
    boolean hasNext();
    Student getNextItem();
    void sort(List<Student> students);

}
