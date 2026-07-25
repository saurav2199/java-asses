 class College {
    String collegeName = "SIT Pune";

    // Inner Class
    class Student {
        void display() {
            System.out.println("Student belongs to " + collegeName);
        }
    }
}

interface Greeting {
    void sayHello();
}

public class InnerAnonymousDemo {
    public static void main(String[] args) {

        // Inner Class object
        College college = new College();
        College.Student student = college.new Student();
        student.display();

        // Anonymous Class
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from Anonymous Class");
            }
        };

        g.sayHello();
    }
}