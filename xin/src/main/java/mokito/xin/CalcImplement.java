package mokito.xin;

public class CalcImplement {
	calc obj;

	
	public int add(int a, int b) {
		return obj.add(a, b);
	}
	
	public int abs(int a, int b) {
		return obj.abs(a, b);
		}

	public int mul(int a,int b) {
		return obj.mul(a, b);
		
	}
	
	
	public double divide(int a, int b) {
		
		return obj.divide(a, b);
	}

	public void setObj(calc mockobj) {
		this.obj = mockobj;
		
	}
}
