/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package UML;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
       iPhonep classUnderTest = newiPhonep();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
