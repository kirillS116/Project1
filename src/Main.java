import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >20){
            System.out.println("You are older than 20 years");
        }
        else {
            System.out.println("You are ");
        }
    }
}