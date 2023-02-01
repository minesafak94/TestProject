package class16;

public class Person {

    private double bankBalance=12345342;//private access
    String Address="Street 123";//default access level is applied

    String name="Jon Snow";

    private void printPhonePassword(){
        System.out.println("pass123");
    }
    void printSSN(){
        System.out.println("1214235");
    }

    public void printTikTokAccount(){
        System.out.println("user123");
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);

        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();//as long as I am in same class no issues with public,default,private, protected
    }
}
