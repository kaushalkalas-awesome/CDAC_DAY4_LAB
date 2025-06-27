package tester;
import java.util.Scanner;
import com.app.geometry.*;

public class TestPoint {
	
	Point2D p1,p2;
	
	void setData() {
		double x1,x2,y1,y2=0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x1: ");
		x1 = sc.nextDouble();
		
		System.out.print("Enter y1: ");
		y1 = sc.nextDouble();
		
		System.out.print("Enter x2: ");
		x2 = sc.nextDouble();
		
		System.out.print("Enter y2: ");
		y2 = sc.nextDouble();
		
		p1 = new Point2D(x1,y1);
		p2 = new Point2D(x2,y2);
	}
	
	
	public static void main(String[] args) {
		TestPoint tp = new TestPoint();
		tp.setData();
		
		System.out.println("Co-ordinate of 1 point: "+tp.p1.getDetails());
		System.out.println("Co-ordinate of 2 point: "+tp.p2.getDetails());
		
		if(tp.p1.isEqual(tp.p2)) {
			System.out.println("Both Same");
		} else {
			System.out.println("Both are Not Same");
		}
		
		System.out.println("Distance: "+tp.p1.calculateDistance(tp.p2));

	}

}
