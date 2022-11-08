import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        double height,height1,weight,weight1;
        System.out.print("一人目の身長:");
        height = xyz.nextDouble();
        System.out.print("一人目の体重:");
        weight = xyz.nextDouble();
	System.out.print("二人目の身長:");
	height1 = xyz.nextDouble();
	System.out.print("二人目の体重:");
	weight1 = xyz.nextDouble();
        double bmi = weight / (height * height);
        String bmi1 = String.format("%.2f",bmi);
        double BMI = Double.parseDouble(bmi1);
	double bmi2 = weight1 / (height1 * height1);
	String bmi3 = String.format("%.2f",bmi2);
	double BMI1 = Double.parseDouble(bmi3);
        System.out.println(BMI);
	System.out.println(BMI1);
    }
}
