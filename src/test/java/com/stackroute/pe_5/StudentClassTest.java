package com.stackroute.pe_5;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.lang.String;

import static org.junit.Assert.assertEquals;


public class StudentClassTest {

    @Before
    public void setUp() {


    }

    @After
    public void tearDown() {

    }

    @Test
    public void testStudentClass() {

        List<StudentClass> students = new ArrayList<>();
        StudentClass obj1 = new StudentClass(1, "Ajay", 27);
        StudentClass obj2 = new StudentClass(2, "Sneha", 23);
        StudentClass obj3 = new StudentClass(3, "Simran", 37);
        StudentClass obj4 = new StudentClass(4, "Ajay", 22);
        StudentClass obj5 = new StudentClass(5, "Ajay", 29);
        StudentClass obj6 = new StudentClass(6, "Sneha", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);

        //BEFORE SORTING
//        [Student{id=1, name='Ajay', age=27}, Student{id=2, name='Sneha', age=23}, Student{id=3, name='Simran', age=37}, Student{id=4, name='Ajay', age=22}, Student{id=5, name='Ajay', age=29}, Student{id=6, name='Sneha', age=22}]

        Collections.sort(students, new StudentSorter());

        // After Sorting

        String expected="[Student{id=3, name='Simran', age=37}, Student{id=5, name='Ajay', age=29}, Student{id=1, name='Ajay', age=27}, Student{id=2, name='Sneha', age=23}, Student{id=6, name='Sneha', age=22}, Student{id=4, name='Ajay', age=22}]";
        assertEquals(expected, students.toString());


    }


    }


