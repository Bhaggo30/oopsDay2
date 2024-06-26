 interface Interface_Developer {
    void developApp();
}
interface Tester1 {
    void testApp();

}
class Manager{
    void assignWork(){
        System.out.println("manager is assiging work");
    }
}
class Company extends Manager implements Tester1,Interface_Developer{

    @Override
    public void developApp() {
        System.out.println("developer is devloping the app");
    }

    @Override
    public void testApp() {
        System.out.println("tester is testing the app");
    }
}
class MainClass{
    public static void main(String[] args) {
        Company c = new Company();
        c.developApp();
        c.testApp();
        c.assignWork();

    }
}