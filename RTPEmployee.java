public class RTPEmployee {
    public  void work(){
        System.out.println("employee is working");
    }
}
class Developer extends RTPEmployee{
    @Override
    public void work(){
        System.out.println("developer is developing  the app");
    }
}
class Tester extends RTPEmployee{
    @Override
    public void work(){
        System.out.println("tester is testing  the app");
    }
}
class EmployeemainClass{
    public static void main(String[] args) {
        RTPEmployee emp = new Developer();
        emp.work();
        RTPEmployee empp = new Tester();
        empp.work();
    }
}
