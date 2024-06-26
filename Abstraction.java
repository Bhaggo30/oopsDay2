interface Student{
    void work();
}
class Teacher implements Student{
    @Override
    public void work(){
        System.out.println("my real code is here");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Student t = new Teacher();
        t.work();
    }
}
