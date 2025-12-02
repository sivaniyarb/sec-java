import java.util.Scanner;
public class string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name=sc.nextLine();
        System.out.println("hello "+name+"!");
        System.out.println("length of string is: "+name.length());
        System.out.println("uppercase: "+name.toUpperCase());
        System.out.println("lowercase: "+name.toLowerCase());
    }
}
