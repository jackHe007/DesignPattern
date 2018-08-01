package com.jackie.designpattern.demo.iterator;

import com.jackie.designpattern.demo.aggregate.AbstractStudentList;
import com.jackie.designpattern.demo.bean.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/1 - 15:29
 * @history 2018/8/1 - 15:29 ting.he4@pactera.com  create.
 */
public class StudentIterator implements StudentListIterator {

    private List<Student> students;
    private AbstractStudentList abstractStudentList;
    private int cursor1;//正向遍历

    public StudentIterator(AbstractStudentList abstractStudentList) {
        this.abstractStudentList = abstractStudentList;
        this.students = abstractStudentList.getStudents();
        this.cursor1 = 0;
    }

    @Override
    public void next() {
        if (cursor1 < students.size()) {
            cursor1++;
        }
    }

    @Override
    public boolean hasNext() {
        return cursor1 != students.size();
    }

    @Override
    public Student getNextItem() {
        return students.get(cursor1);
    }

    @Override
    public void sort(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getAge() - s1.getAge();
            }
        });
    }

}
