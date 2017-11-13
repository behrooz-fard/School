/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author behrooz
 */
public class Student extends Human {
    
    /*
    fields
    */
    private String studentID;
    private String field;
    
    private int classNum;

    /*
    constructore
    */

    public Student(String studentID, String field,
            int classNum, String name,
            String familyName, String id,
            String gender, int birthYear) {
        
        super(name, familyName, id, gender, birthYear);
        this.studentID = studentID;
        this.field = field;
        this.classNum = classNum;
    }
    
    /*
    get and set
    */
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String getName(String gender) {
        return "Student " + gender + " " + this.getName();
    }
    
    
}