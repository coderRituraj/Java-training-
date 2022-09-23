package Com.bhavna.taks2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestCsSource {
	/*@ParameterizedTest
	@CsvSource(int num = {10,20,30,40})
	@DisplayName("ParameterizedValueSource")
	public void testCheckValueSource(int num) {
		CsSource obj =new CsSource();
		assertEquals(true,obj,IsOdd(num))
	}
	*/
	
	@ParameterizedTest
    @ValueSource(ints = {10,15,20,25})
    @DisplayName("ParameterisedValueSource")
    public void testCheckValueSource(int num) {
		CsSource obj = new CsSource();
		System.out.print(obj.isOdd(num));
        assertEquals(true,obj.isOdd(num));
    }
	
	@ParameterizedTest
    @CsvSource({"1,true","15,false","20,true","25,false","30,true"})
    @DisplayName("ParameterisedCsvSource")
    public void testCheckCsvSourceValue(int num, boolean value) {
		CsSource  obj=new CsSource ();
		System.out.println(obj.isOdd(num));
		
        assertEquals(value,obj.isOdd(num));
    }

    @ParameterizedTest
    @CsvFileSource(resources="D:\newMerged.txt")
    @DisplayName("ParameterisedCsvFileSource")
    public void testCheckCsvFileSourceValue(int num, boolean value) {
    	CsSource  o1=new CsSource ();
    	System.out.println(o1.isOdd(num));
        assertEquals(value,o1.isOdd(num));
    }

}
