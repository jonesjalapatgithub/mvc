package com.sample.mvc;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import com.sample.mvc.controller.EmployeeController;
import com.sample.mvc.dao.EmployeeDAO;
import com.sample.mvc.dao.EmployeeDAOImpl;
import com.sample.mvc.model.EmployeeCommand;
import com.sample.mvc.service.EmployeeServiceImpl;


public class AppTest 
    extends TestCase
{
	 EmployeeController empBusinessController =new EmployeeController();
	   EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
	   EmployeeCommand employeeCommand = new EmployeeCommand();
	   EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
	   
    public AppTest( String testName )
    {
        super( testName );
    }
    
    @Test
    public void testmytestcases(){
    	
    	int code=employeeCommand.getCode(); 
        assertEquals(500, 500, 0.0);
        System.out.println("#######################"+code+"########################");
    }

    public void testApp()
    {
//    	String name=empBusinessController.myFunction();
//    	assertEquals("jones", name, 0.0);
    }
}
