package assignment1;
//@author 15332286 

import org.joda.time.DateTime;
import java.util.ArrayList;
 
public class Course {

    private String courseName;
    //List<Student> students = new ArrayList<>();
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    
    private final DateTime date = new DateTime();
    
    DateTime startDate = new DateTime(date);    //DateTime dt = new DateTime();
    DateTime endDate = new DateTime(date);      //int month = dt.getMonthOfYear();  // Jan: 1 and Dec: 12
                                                //int year = dt.getYear();
    
    public Course(String name, DateTime start, DateTime end) {
        this.courseName = name;
        this.startDate = start;
        this.endDate = end;
        
        this.modules = new ArrayList();
        this.students = new ArrayList();
    }
    
    //Student foo = new Student(23, "Foo", 22);
    //students.add (foo);
    public void addModule(Module module) {
        modules.add(module);
    }
    //Need to list modules when called
    
    public void addStudent(Student student) {
        students.add(student);
    }
    //Need to list students when called
}
