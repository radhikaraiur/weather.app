class Student {
    String name;
    int regno;

    Student() {
        name = "Sunny";
        regno = 1234;
    }

    Student(String n, int r) {
        name = n;
        regno = r;
    }

    Student(Student s) {
        name = s.name;
        regno = s.regno;
    }

    void display()
    {
        System.out.println(name+""+regno)
    }
}

class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Jony", 12);
        Student s3 = new Student(s1);
        s1.display();
        s2.display();
        s3.display();
    }
}