package assignment1;

import java.time.LocalDate;
import java.time.Period;
//@author 15332286

public class Student {

    private String name;
    private int age;
    private LocalDate dob;
    private LocalDate today;
    private static int ID = 201800;

    private String username;
    private final Course course;
    private final Module module;

    //https://stackoverflow.com/questions/29062204/create-localdate-object-from-integers
    public Student(String name, LocalDate dob, Course course, Module module) {
        this.name = name;
        this.dob = dob.of(year, month, day);
        this.course = course;
        this.module = module;
        this.ID +=1;
        this.age = calculateAge();
        //this.age = age; figure out age from dob..
    }
    
    private int calculateAge() {
        if ((dob != null) && (today != null)) {
            return Period.between(dob, today).getYears();
        } else {
            return 0;
        }
    }
    
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Date getDOB() {
        return dob;
    }
    
    //student.getCourses: for each course that contains student, return name..
    
    public String getUsername() {
        username = name + "_" + age;
        return username;
    }

}



/*public class AgeCalculator {

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}*/