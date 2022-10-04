import java.util.Scanner;
 
class Circle4{
	private double x,y;
	private int radius;
	public Circle4(double x,double y,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public static void largestCircle(Circle4 c[]) {
		double max=Math.pow(c[0].radius, 2);
		int maxi=0;
		for(int i=1;i<c.length;i++) {
			if(max<Math.pow(c[i].radius, 2)) {
				max=Math.pow(c[i].radius, 2);
				maxi=i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[maxi].show();
	}
}
 
public class Practice6 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle4 c []= new Circle4[3];// 4개의 Circle 배열 선언
		for(int i=0; i< 3 ; i++) {
			System.out.print("x, y, radius >>");
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			int radius=scanner.nextInt();
			c[i] = new Circle4(x,y,radius); // Circle 객체 생성
		}
		Circle4.largestCircle(c);
		scanner.close();
	}
}