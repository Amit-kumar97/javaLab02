import java.util.Scanner;

//----------to check the maximum between two numbers
class max
{
    int num1;
    int num2;
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
    }
    public void m1()
    {
        if (num1>num2) {
            System.out.println(num1+" is greater than "+num2);
        }
        else {
            System.out.println(num2+" is greater than "+num1);
        }
//--------------int maxnum = Math.max(num1,num2);
//--------------System.out.println(maxnum);
    }
}
public class checkmax {
    public static void main(String[] args) {
        max obj =new max();
        obj.m1();
    }
}
