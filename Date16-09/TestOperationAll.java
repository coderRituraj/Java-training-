package ArrayTask;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestOperationAll {
	 @Test
	    void test() {
	        Operation obj=new Operation();
	        boolean res=obj.isSmaller(5, 5);
	        
	        assertEquals(1,0);
	        assertNull(null);
	    }
	    
	  
	    @BeforeEach
	    void method1() {
	        System.out.println("Before each!");
	    }
	    
	    @AfterEach
	    void method2() {
	        System.out.println("After each!");
	    }
	   
	    @BeforeAll
	    void method3() {
	        System.out.println("Before All!");
	    }
	    
	   
	    @AfterAll
	    void demo4() {
	        System.out.println("After All!");
	    }
	    
	     
	    @DisplayName("Assert Tester")
	    public void testAssert(){                    
	                
	        //Variable declaration        
	        String str1="Jon Snow";                    
	        String str2="Mad King";                    
	        String str3="Kind King";                    
	                          
	        String str4=null;                    
	        int var1=1;                    
	        int var2=2;               
	        boolean res=(var1<var2);
	                
	        //Assert statements        
	        assertEquals(str1,str2);                    
	        assertNotEquals(str1, str3);                           
	        assertNotNull(str1);            
	        assertNull(str4);            
	        assertNotEquals(str2,str3);                    
	        assertTrue(res);
	        assertFalse(!res);
	    }        

}
