package com.bhavna.assessment_modification_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.bhavna.assessment_modification.*;

class TestCaseTest {

	  @Test
	    @DisplayName("TestAddReferral()")
	    public void testmethod() {
	        Referral tester=new Referral();
	        tester.editReferral("Rituraj","86545656","rituraj@gmail.com");
	        assertNotNull(Referral.referralLst);
	    }
	    @Test
	    @DisplayName("TestViewReferral()")
	    public void testView() {
	        Referral tester=new Referral();
	        tester.viewReferral();
	        assertNotNull(Referral.referralLst);
	    }
	    
	    @Test
	    @DisplayName("TestEditReferral()")
	    public void testEdit() {
	        Referral tester=new Referral();
	        Referral tester1=tester;
	        tester.editReferral("Rituraj","1234565","rituraj@gmail.com");
	        tester.viewReferral();
	        tester1.viewReferral();
	        assertSame(tester,tester1);
	    }
	    
	    @BeforeAll
	    static void setUpBeforeClass() throws Exception {
	        System.out.println("before all");
	    }





	  @AfterAll
	    static void tearDownAfterClass() throws Exception {
	        System.out.println("after all");
	    }





	  @BeforeEach
	    void setUp() throws Exception {
	        System.out.println("before each");
	    }





	  @AfterEach
	    void tearDown() throws Exception {
	        System.out.println("after each");
	    }

}
