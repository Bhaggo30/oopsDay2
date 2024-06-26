import javax.lang.model.util.SimpleElementVisitor14;

public class EncapsulationStudentMain {

    public static void main(String[] args) {

        EncapsulationStudent student =new EncapsulationStudent();
        student.setsId(101);
        student.setsName("bhagyashree");
        student.setsAddress("banglore");

        int id = student.getsId();
        String name = student.getsName();
        String address = student.getsAddress();

        System.out.println("Id of the student  "+student.getsId());
        System.out.println("name of the student  "+name);
        System.out.println("address of the student "+address);

    }
}
