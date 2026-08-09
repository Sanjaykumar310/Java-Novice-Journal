class A {

    private int rollNumber;
    private String name;
    private int[] marks;

    // Parameterized constructor
    public A(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Setter
    public void setrollNumber(int rollNumber) {

        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        } else {
            System.out.println("Enter valid number");
        }
    }

    // Getter
    public int getrollNumber() {
        return rollNumber;
    }

    // Setter
    public void setname(String name) {

        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Enter valid name");
        }
    }

    // Getter
    public String getname() {
        return name;
    }

    // Setter
    public void setmarks(int[] marks) {

        if (marks != null) {
            this.marks = marks;
        } else {
            System.out.println("Enter valid marks");
        }
    }

    // Getter
    public int[] getmarks() {
        return marks;
    }

    // Calculate total
    public int calculateTotal() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average
    public double calculateAverage() {

        return (double) calculateTotal() / marks.length;
    }

    // Find grade
    public void findGrade() {

        double average = calculateAverage();

        if (average >= 80) {
            System.out.println("Grade : A");
        }
        else if (average >= 60) {
            System.out.println("Grade : B");
        }
        else if (average >= 50) {
            System.out.println("Grade : C");
        }
        else if (average >= 40) {
            System.out.println("Grade : D");
        }
        else {
            System.out.println("Grade : F");
        }
    }
}
class Adriver {

    public static void main(String[] args) {

        int[] marks = {80, 60, 50, 40, 30};

        A a = new A(12, "Sam", marks);

        System.out.println("Roll Number : " + a.getrollNumber());
        System.out.println("Name : " + a.getname());

        System.out.println("Total : " + a.calculateTotal());

        System.out.println("Average : " + a.calculateAverage());

        a.findGrade();
    }
}