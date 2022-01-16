class stu
{
    static int Rollno;
    static int[] arr;
    public static void m1(int Rollno1,int[] arr1)
    {
        Rollno=Rollno1;
        arr=arr1;
    }
    public static void display()
    {
        System.out.println(Rollno);
        for (int res:arr)
        {
            System.out.println(res);
        }
    }
}
public class DEmo01 {
    public static void main(String[] args) {
        stu.m1(23,new int[]{12,23,44,56});
        stu.display();
    }
}
