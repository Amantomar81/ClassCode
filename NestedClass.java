public class Nestedclass
{
    static int num;
    public Nestedclass()
      {
        num = 20;
      }
    static class inner
    {
        int num1;
        public inner(int a, String b)
           {
            num1 = 10;
           }
        public void display()
        {
            System.out.println(num);
            System.out.println(num1);
        }
    }
}
class Test1
{
    public static void main(String[] args) 
    {
        Nestedclass.inner obj = new Nestedclass.inner(2,"AMAN");
        obj.display();
        Nestedclass obj2 = new Nestedclass();
        System.out.println(obj2.num);
    }
}
