
     class Father{

        int age = 45;

    }
    class Son extends Father{
      String name = "Tom";

    }

    public class SingleLevelInheritance {

    public static void main(String[] args) {

      Son s = new Son();
        System.out.println("father age :"+s.age);
        System.out.println("son name :"+s.name);



    }
}


