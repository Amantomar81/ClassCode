/*
Claa -> Stu
Attributes -> Roll_no , name, marks,U_name.
Constructor -> Input value from user by using array create 5 students object of the class
print the name of the student who have highest marks.
 */

import java.util.Scanner;
public class Stu {
    int Rollno, marks;
    String name, U_name;
}

    class Aman {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Stu arr[] = new Stu[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = new Stu();
                System.out.println("Enter the Rollno:");
                arr[i].Rollno = sc.nextInt();
                System.out.println("Enter the marks:");
                arr[i].marks =  sc.nextInt();
                System.out.println("Enter the name:");
                arr[i].name = sc.next();
                System.out.println("Enter the U_name:");
                arr[i].U_name = sc.next();
            }
            int max = arr[0].marks;
            int index = 0;
            for(int i = 0;i<5;i++)
            {
                if(arr[i].marks>max)
                {
                    max = arr[i].marks;
                    index = i;
                }
            }

            System.out.println("highest marks got by Student:"+arr[index].name);
        }
    }

