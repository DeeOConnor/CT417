package test;
// @author 15332286

import assignment1.Student;
import java.time.LocalDate;
import java.time.Month;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UniTest {

    @Test
    public void checkUsername() {
        //String name, LocalDate dob, Course course, Module module
        LocalDate newDOB = LocalDate.of(1990, Month.MAY, 10);
        Student s = new Student("Michael", newDOB, "CS & IT", "CT417"); //that shouldn't work as other params are missing..
        //LocalDate newDOB = LocalDate.of(1990, Month.MAY, 10);
        //s.setDateOfBirth(newDOB);
        
        //LocalDate today = LocalDate.now();                          //Today's date
        //LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);  //Birth date
        
        
        //need to create entire course in here!?
        //https://stackoverflow.com/questions/2923227/displaying-date-of-birth-in-java-by-using-date-util for dob
        String testUsername = s.getUsername();
        assertEquals("Michael_28", testUsername);
    }
    
    @Test
    public void checkAge() {
        LocalDate birthDate = LocalDate.of(2000, Month.JANUARY, 31);
        Student s2 = new Student("Michael", birthDate, "CS & IT", "CT417");
        // s2.setDateOfBirth(birthDate);
        //int actual = AgeCalculator.calculateAge(birthDate, LocalDate.of(2016, 7, 12));
        int age = s2.getAge();
        
        assertEquals(18, age);
    }
}


//https://platform.netbeans.org/tutorials/nbm-maven-commandline.html maven installation stuff

/*



 
public class UniTest {
    
    public UniTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void hello() {}
} */
