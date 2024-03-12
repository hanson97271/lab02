import java.util.*;
public class JPA01{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    test();
    test();
}
public static void test(){
    System.out.println("Please enter score:");
    int k=sc.nextInt();
    if(k>=60) System.out.println("You pass");
    System.out.println("End");
}
}
