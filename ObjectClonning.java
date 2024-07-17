class Person implements Cloneable{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void display(){
        System.out.println("id of the person "+id+ " and name of the person "+name);
    }
}
public class ObjectClonning {
    public static void main(String[] args) {
        try {
            Person p1 = new Person(101,"tom");
            System.out.println("this is the original instance of person");
            p1.display();

            Person p2 = (Person)p1.clone();
            System.out.println("now cloned person");
            p2.display();
            p2.id =102;
            p2.name="jack";
            System.out.println("modified object");
            p2.display();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
