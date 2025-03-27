package A_OppsIntro;

public class Student {
    public int age;
    public String address;
    public String name;

    public Student(int age, String address, String name) {
        this.age = age;
        this.address = address;
        this.name = name;
    }

    public void updateAddress(String address){
        this.address= address;
    }

    public int getAge(){
        return this.age;
    }
}
