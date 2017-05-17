/*
 *  Developed by Abdulmuaz Alshaikhli
 * Slmnshukur1993@gmail.com
 * Student Easj.dk 2017. 
 MIT Licensed.
 */
package testsleepmethodthread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author slmns
 */
public class TestSleepMethodThread extends Thread {
public void run(){
    for(int i=0; i<5; i++){
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println(i);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestSleepMethodThread t1 = new TestSleepMethodThread();
        TestSleepMethodThread t2 = new TestSleepMethodThread();
        
        t1.start();
        t2.start();
    }
    
}
