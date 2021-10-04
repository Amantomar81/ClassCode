//passing array as an argument
class Stu {                                             //execution class
    int rollno;             //instance variable
    int arr[];                  //instance var.

    //constructor initialise publically
    public Stu(int rollno, int[] arr) {
        this.rollno = rollno;
        this.arr = arr;
    }

    public void display()                   //instance method
    {                                       //instance area
        System.out.println(rollno);
        for(int res:arr)                        //use for each-loop
        {
            System.out.println(res);
        }
    }
}                                               //end of execution class

//parent class
public class Demo1 {
    public static void main(String[] args) {
        Stu obj1 = new Stu(23,new int[]{23_000,56,78,90});  //anonymous array
        obj1.display();                     //calling method by the help of object
    }
}
