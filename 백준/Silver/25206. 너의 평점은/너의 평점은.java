import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0.0f;
        float scoreSum = 0.0f;
        for (int i = 0; i < 20; i++) {
            String subjects = sc.next();
            float score = sc.nextFloat();
            String grade = sc.next();
            switch(grade) {
                case "A+" :
                    sum += score * 4.5f;
                    scoreSum += score;
                    break;
                case "A0" :
                    sum += score * 4.0f;
                    scoreSum += score;
                    break;
                case "B+" :
                    sum += score * 3.5f;
                    scoreSum += score;
                    break;
                case "B0" :
                    sum += score * 3.0f;
                    scoreSum += score;
                    break;
                case "C+" :
                    sum += score * 2.5f;
                    scoreSum += score;
                    break;
                case "C0" :
                    sum += score * 2.0f;
                    scoreSum += score;
                    break;
                case "D+" :
                    sum += score * 1.5f;
                    scoreSum += score;
                    break;
                case "D0" :
                    sum += score * 1.0f;
                    scoreSum += score;
                    break;
                case "F" :
                    sum += score * 0.0f;
                    scoreSum += score;
                    break;
            }
        }
        System.out.println(sum / scoreSum);
    }
}