/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dam1.test;

import dam1.insti.Curso;
import dam1.insti.Nif;
import dam1.insti.Persona;
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
public class CursoTest {
    
   @Test
    public void testAñadirAlumno() {
        Persona p1 = new Persona();
        Curso c1 = new Curso("DAM");
        c1.aniadirAlumno(p1);
        assertEquals(1, c1.getListaAlumnos().size());
    }
}
