package mokito.xin;

import static org.mockito.Mockito.*;
import org.junit.Test;

import junit.framework.TestCase;

public class CalcImplementTest extends TestCase {

	CalcImplement obj;
	int a,b;

	protected void setUp() throws Exception {
		obj = new CalcImplement();
		a=10;
		b=3;
		calc mockobj = mock(calc.class);
		when(mockobj.add(a, b)).thenReturn(a+b);
		when(mockobj.abs(a, b)).thenReturn(a-b);
		when(mockobj.mul(a, b)).thenReturn(a*b);
		when(mockobj.divide(a, b)).thenReturn((double) a/b);
		obj.setObj(mockobj);
		
	}

	protected void tearDown() throws Exception {
		obj = null;
		a =0;
		b=0;
	}

	public void testAdd() {
		assertEquals(a+b, obj.add(a, b));
	}

	public void testAbs() {
		assertEquals(a-b, obj.abs(a, b));
	}

	public void testMul() {
		assertEquals(a*b, obj.mul(a, b));
	}

	public void testDivide() {
		assertEquals((double)10/3, obj.divide(a, b));
	}

}
