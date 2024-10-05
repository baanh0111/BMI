import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Bình thường");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }


    }
}


