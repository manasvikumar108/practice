import java.util.Scanner;
public class greeting{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello "+ name +"!");
        System.out.println("Welcome to my GitHub account.");
        s.close();
    }
}