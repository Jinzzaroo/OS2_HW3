class Sample {
	public int a;
	private int b;
	int c;
}

public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10; //private으로 선언되었으므로 여기선 b 접근 불가능
		aClass.c = 10;
	}
}