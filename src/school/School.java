/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.ArrayList;

/**
 *
 * 9512029
 * 9512034 +
 * 9412301
 * 9512026
 * 9512021
 * 9427060
 * @author behrooz 9413022
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        ArrayList<Class> classes = new ArrayList();
        ArrayList<Student> students = new ArrayList();
        ArrayList<Teacher> teachers = new ArrayList();
        
        init(classes, teachers, students);
    }
    public static void init(ArrayList<Class> classes,
            ArrayList<Teacher> teachers,
            ArrayList<Student> students) {
        
        students.add(new Student("9111002", "math",
                101, "Hassan",
                "Hassani", "0020344342",
                "man", 1998));
        students.add(new Student("9111002", "math",
                101, "Hossein",
                "Hosseini", "0020344342",
                "man", 1998));
        students.add(new Student("9111002", "math",
                101, "Hashem",
                "Hashemi", "0020344342",
                "man", 1998));
        students.add(new Student("9111002", "math",
                101, "Ahmad",
                "Ahmadi", "0020344342",
                "man", 1998));
        students.add(new Student("9111002", "math",
                101, "Kazem",
                "Kazemi", "0020344342",
                "man", 1998));
        students.add(new Student("9111002", "math",
                101, "Heshmat",
                "Heshmati", "0020344342",
                "man", 1998));
        
        teachers.add(new Teacher("9011032", "math",
                "Mehdi", "Ghatee",
                "00329729", "male", 1970));
        
        teachers.add(new Teacher("9011032", "math",
                "Nazanin", "Tavana",
                "00329729", "woman", 1968));
        
        classes.add(new Class(101, students, teachers));
        
        classes.get(0).printClassData();
    }
    
}
