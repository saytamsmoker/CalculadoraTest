/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saita
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    /**
     * Test of getNum1 method, of class Calculadora.
     */
    @Test
    public void testGetNum1() {
        System.out.println("getNum1");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getNum1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum1 method, of class Calculadora.
     */
    @Test
    public void testSetNum1() {
        System.out.println("setNum1");
        int num1 = 0;
        Calculadora instance = new Calculadora();
        instance.setNum1(num1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum2 method, of class Calculadora.
     */
    @Test
    public void testGetNum2() {
        System.out.println("getNum2");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getNum2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum2 method, of class Calculadora.
     */
    @Test
    public void testSetNum2() {
        System.out.println("setNum2");
        int num2 = 0;
        Calculadora instance = new Calculadora();
        instance.setNum2(num2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Restar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Multiplicar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Dividir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
