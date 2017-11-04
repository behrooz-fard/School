/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.ArrayList;

/**
 *
 * @author behrooz
 */
public class Class {
    
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    
    private int classID;

    public Class(int classID,
            ArrayList<Student> students,
            ArrayList<Teacher> teachers) {
        
        this.classID = classID;
        this.students = students;
        this.teachers = teachers;
    }
    
    public void printClassData() {
        
        System.out.println("Class: " + this.classID);
        System.out.println("Teachers: ");
        for (int i = 0; i < teachers.size(); i++) {
            
            System.out.println(teachers.get(i).getName()
                    + "  " + 
                    teachers.get(i).getFamilyName());
        }
        System.out.println("Students: ");
        for (int i = 0; i < students.size(); i++) {
            
            System.out.println(students.get(i).getName()
                    + "  " + 
                    students.get(i).getFamilyName());
        }
    }
    
}