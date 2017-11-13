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
public class Human {
    
    /*
    Fields
    */
    private String name;
    private String familyName;
    private String id;
    private String gender;

    private int birthYear;
    
    /*
    Constructor
    */
    public Human(String name, String familyName,
            String id, String gender, int birthYear) {
        
        this.name = name;
        this.familyName = familyName;
        this.id = id;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    /*
    Getter and Setter
    */
    public String getName() {
        return name;
    }
    
    public String getName(String gender) {
        return gender + " " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}