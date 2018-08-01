package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.aggregate.AbstractStudentList;
import com.jackie.designpattern.demo.aggregate.StudentList;
import com.jackie.designpattern.demo.bean.Student;
import com.jackie.designpattern.demo.iterator.StudentListIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/1 - 16:11
 * @history 2018/8/1 - 16:11 ting.he4@pactera.com  create.
 */
public class StudentListClient {

    public static void main(String[] args) {
        AbstractStudentList studentList;
        StudentListIterator iterator;
        List<Student> students = new ArrayList<Student>();
        Student stu1 = new Student("zhangsan", 12);
        Student stu2 = new Student("lisi", 16);
        Student stu3 = new Student("wangwu", 13);
        Student stu4 = new Student("zhaoliu", 11);
        Student stu5 = new Student("lilei", 12);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);
        studentList = new StudentList(students);
        iterator = studentList.getStudentListIterator();
        iterator.sort(students);
        while (iterator.hasNext()) {
            Student item = iterator.getNextItem();
            System.out.println(item.getName() + ":" + item.getAge());
            iterator.next();
        }

    }

}
