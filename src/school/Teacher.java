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
public class Teacher extends Human {
    
    /*
    fileds
    */
    private String teacherID;
    private String field;
    
    /*
    constructor
    */

    public Teacher(String teacherID, String field,
            String name, String familyName,
            String id, String gender,
            int birthYear) {
        
        super(name, familyName, id, gender, birthYear);
        this.teacherID = teacherID;
        this.field = field;
    }

    
    
    /*
    get and set
    */

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    
}
