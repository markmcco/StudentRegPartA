package Test;

import com.mycompany.student_registration_system.Student;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MMC
 */
public class usernameTest {
    @Test
    public void usernameTest() {
        
        Student s = new Student("Mark Mc Conn", "14318371");

        String expected = "Mark Mc Conn14318371";
        String result = s.getUserName();
        System.out.println(result);
        assertEquals(expected, result);
    }
}
