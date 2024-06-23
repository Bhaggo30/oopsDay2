
class University{
    String universityName ="VTU";

    public void conductExam(){
        System.out.println("VTU is conducting exam");
    }
}
class College extends University{
    String collegeName = "JEC";

    public void conductInternal(){
        System.out.println("jec is conducting exam");
    }
}
class Department extends College{
    String departmentName = "computer science";

    public void giveAssignment(){
        System.out.println("department gives assignment to the students");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Department dept = new Department();
        System.out.println("name of the university " +dept.universityName);
        System.out.println("name of the college "+dept.collegeName);
        System.out.println("name of the department "+dept.departmentName);
        dept.conductExam();
        dept.conductInternal();;
        dept.giveAssignment();

    }
}
