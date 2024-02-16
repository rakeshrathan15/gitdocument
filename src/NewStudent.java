public class NewStudent {

        // Attributes
        private String name;
        private int age;
        private double grade;

        // Constructor
        public Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // Method to display student information
        public void displayStudentInfo() {
            System.out.println("Student Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }

        // Main method for testing
        public static void main(String[] args) {
            // Create a new student
            Student newStudent = new Student("John Doe", 18, 90.5);

            // Display student information
            newStudent.displayStudentInfo();
        }


}