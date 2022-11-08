import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        double height,weight;
        System.out.print("êgí∑:");
        height = xyz.nextDouble();
        System.out.print("ëÃèd:");
        weight = xyz.nextDouble();
        double bmi = weight / (height * height);
        String bmi1 = String.format("%.2f",bmi);
        double BMI = Double.parseDouble(bmi1);
        System.out.println(BMI);
    }
}
