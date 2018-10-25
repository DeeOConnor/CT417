package assignment1;
//@author 15332286

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String id; //could be a string, i.e. CT417
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public Module(String moduleName, String id) {
        this.moduleName = moduleName;
        this.id = id;
        
        this.courses = new ArrayList();
        this.students = new ArrayList();
    }
    
    public void addCoure(Course course) {
        courses.add(course);
    }
    //public Course listCourses() {
    //    for(Course c: courses) {
    //        return courses.get(c);
    //    }
    //}
    
    //Need same for listing students
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public String getModuleName() {
        return moduleName;
    }
    public void setModuleName (String moduleName) {
        this.moduleName = moduleName;
    }
    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
}
