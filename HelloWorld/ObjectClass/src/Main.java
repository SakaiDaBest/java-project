public class Main {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent alice = new PrimarySchoolStudent("Alice", 10, "Mrs. Smith");
        System.out.println(alice);
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;  // Declare parentName field

    PrimarySchoolStudent(String name, int age, String parentName) { // Corrected constructor
        super(name, age);  // Call parent constructor
        this.parentName = parentName;  // Initialize parentName
    }

    @Override
    public String toString() {
        return super.toString() + ", Parent: " + parentName;
    }
}
