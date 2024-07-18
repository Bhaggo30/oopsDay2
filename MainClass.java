 class Name {

    String name;

    public String getName(String name){
        this.name = name;
        return name;
    }
}
class Age{
    int age;
    public int getAge(int age ){
        this.age = age;
        return age;
    }
}
class MobileNumber{
    long mNumber;
    public long getmNumber(long mNumber){
        this.mNumber = mNumber;
        return mNumber;
    }
}
public class MainClass{
    public static void main(String[] args) {
        Name name = new Name();
        System.out.println("name of the student "+name.getName("bhagyashree"));
        Age age = new Age();
        System.out.println("age of the student "+age.getAge(24));
        MobileNumber mobileNumber = new MobileNumber();
        System.out.println("mobile number of the student "+mobileNumber.getmNumber(7772944239l));

    }

}
