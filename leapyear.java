import java.util.Scanner;

class leap{
    int year;
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        year = sc.nextInt();
    }
    public void m2()
    {
        if (((year % 4==0)&&(year % 100!=0))||(year % 400==0)){
            System.out.println(year+" is a leap year.");
        }
        else {
            System.out.println(year+" is not a leap year.");
        }
    }
}
public class leapyear {
    public static void main(String[] args) {
        leap obj=new leap();
        obj.m2();
    }
}
