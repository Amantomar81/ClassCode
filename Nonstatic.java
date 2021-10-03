public class Nonstatic {
    class two{
        class three{
           // public static Object four;

           //static class four
          class four {
                int a =20;
                public void display(){
                    System.out.println(this.a);
                }

               /* public static void main(String[] args) {
                    four obj = new four();
                    obj.display();
                }*/

            }
        }
    }
}
class Test{
   public static void main(String[] args) {
        new Nonstatic().new two().new three().new four().display();

    }
}
