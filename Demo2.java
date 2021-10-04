class Stu1              //execution class
{
    static int Rollno;          //static variable
    static int[] arr;           //static variable

    public static void m1(int Rollno1,int[] arr1)       //static
    {
        Rollno=Rollno1;
        arr = arr1;
    }
    public static void display()                //static method
    {                                                           //instance area
        System.out.println(Rollno);
        for (int res:arr)                       //use for each-loop
        {
            System.out.println(res);
        }
    }
}           //end of execution class

//parent class
public class Demo2 {
    public static void main(String[] args) {
        Stu1.m1(23,new int[]{12,23,44});
        Stu1.display();         //calling method by the help of object
    }
}
