package com.jackie.designpattern.demo.aggregate;

import com.jackie.designpattern.demo.bean.Student;
import com.jackie.designpattern.demo.iterator.StudentListIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/1 - 15:22
 * @history 2018/8/1 - 15:22 ting.he4@pactera.com  create.
 */
public abstract class AbstractStudentList {

    protected List<Student> students = new ArrayList<Student>();

    public void add(Student stu) {
        this.students.add(stu);
    }

    public void remove(Student stu) {
        this.students.remove(stu);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public abstract StudentListIterator getStudentListIterator();

    public AbstractStudentList(List<Student> students) {
        this.students = students;
    }
}
