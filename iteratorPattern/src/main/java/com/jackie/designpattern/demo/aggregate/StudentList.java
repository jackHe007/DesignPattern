package com.jackie.designpattern.demo.aggregate;

import com.jackie.designpattern.demo.bean.Student;
import com.jackie.designpattern.demo.iterator.StudentIterator;
import com.jackie.designpattern.demo.iterator.StudentListIterator;

import java.util.List;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/1 - 16:09
 * @history 2018/8/1 - 16:09 ting.he4@pactera.com  create.
 */
public class StudentList extends AbstractStudentList {

    public StudentList(List<Student> students) {
        super(students);
    }

    @Override
    public StudentListIterator getStudentListIterator() {
        return new StudentIterator(this);
    }

}
