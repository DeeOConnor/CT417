package assignment1;
//@author 15332286 

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate dob;
    private static int ID = 201800;

    private String username;
    private String course;
    private String module;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name, LocalDate dob, String course, String module) {
        this.name = name;
        this.course = course;
        this.module = module;
        this.ID += 1;
        this.dob = dob;
        this.age = calculateAge();
        
        this.courses = new ArrayList();
        this.modules = new ArrayList();
    }
    
    public void addCoure(Course course) {
        courses.add(course);
    }
    //public Course listCourses() {
        
    //    for (Course c : courses) {
    //        return courses.get(c.toString());
    //    }
    //    return courses.get(c);
    //}
    
    //Need same for listing modules
    
    public void addModule(Module module) {
        modules.add(module);
    }
    
    private int calculateAge() {
        LocalDate today;
        today = LocalDate.now();
        
        //System.out.println("\n\ntoday val: " + dob);
        //if (dob != null) {
        this.age = Period.between(dob, today).getYears();
        
        //System.out.println("\n\n\n\n\nage val: " + age);
        return age;
    }
    
    
//student.getCourses: for each course that contains student, return name..
    public String getUsername() {
        username = name + "_" + Integer.toString(age);
        return username;
    }
    
    //Getter and Setter methods for attributes
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getModule() {
        return module;
    }
    public void setModule(String module) {
        this.module = module;
    }
    public int getID() {
        return ID;
    }
    public void setID(int id) {
        this.ID = id;
    }
    public LocalDate getDateOfBirth() {
        return dob;
    }
    public void setDateOfBirth(LocalDate dob) {
        this.dob = dob;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}