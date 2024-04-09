/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dam1.test;

import dam1.insti.Persona;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class PersonaTest {
    
    @Test
    public void testGetEdad() {
        Persona p1 = new Persona();
        p1.setNacimiento(LocalDate.of(2005, 12, 1));
        assertEquals(18, p1.getEdad());
    }
    
    @Test
    public void testEquals() {
        Persona p1 = new Persona(12345678);
        Persona p2 = new Persona(12345678);
        assertTrue(p1.equals(p2));
    }
    
    
}
