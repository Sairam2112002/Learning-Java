package learning.oop;

class Student {
    String name;
    int age;
    int birthYear;

    // default constructor
    public Student() {
        System.out.println("This is the default constructor");
    }

    // parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // overloaded parameterized constructor
    public Student(String name, int age, int birthYear) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
    }

    // copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.birthYear = student.birthYear;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("----------**********----------");

        Student s2 = new Student("Sai Ram", 21);
        System.out.println(s2.name + " " + s2.age);
        System.out.println("----------**********----------");

        Student s3 = new Student("Sai Ram", 21, 2002);
        System.out.println(s3.name + " " + s3.age + " " + s3.birthYear);
        System.out.println("----------**********----------");

        Student s4 = new Student(s3);
        System.out.println(s4.name + " " + s4.age + " " + s4.birthYear);
    }
}


