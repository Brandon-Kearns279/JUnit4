/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit4;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Brandon Kearns
 */
public class TriangleTest {
    Triangle Sigma;
    public TriangleTest() {
    }
    @Test
    public void testR1() {
        Sigma = new Triangle(4, 4, 4);
    }
    
    @Test
    public void testR2() {
        Sigma = new Triangle(4, 4, 5);
    }
    
    @Test
    public void testR3() {
        Sigma = new Triangle(4, 3, 5);
    }
    
    @Test
    public void testR4() {
        Sigma = new Triangle(5, 1, 2);
        //While this test fails, it technically passes,
        //See, this is meant to be wrong, so it should fail,
        //but in instance of it failing, that means it is working?
        //I am sure there is some way that makes this work right,
        //and have the test pass when the error is thrown, but 
        //this is what I have here for now, and testR5 will be
        //of a similar nature
    }
    
    @Test
    public void testR5() {
        Sigma = new Triangle(1, 201, 4);
    }
}
