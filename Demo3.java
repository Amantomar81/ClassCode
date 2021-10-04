class Emp
{
    private int id;
    private int sal;
    // getter and setter method

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Emp obj1 = new Emp();
        obj1.setId(12);
        obj1.setSal(12000);
        System.out.println(obj1.getId());
        System.out.println(obj1.getSal());
    }

}
