package maccess;

import java.util.Scanner;
import static java.lang.Math.*;

public class DStatic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value:");
		double val = s.nextDouble();
		double z = sqrt(val);// Method call directly without class_name
		System.out.println("SQRT of " + val + " is " + z);
		s.close();
	}
}