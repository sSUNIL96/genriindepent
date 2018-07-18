package com.ninad.project.testng.genTestNG;

import com.ninad.project.utility.Authenticate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
    	System.out.println(Authenticate.authenticate("admin", "admin123"));
    }
}
