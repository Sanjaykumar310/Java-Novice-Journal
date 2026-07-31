class Course{

        int courseId;
        String courseName;
        String duration;
        double fees;

        Course(int courseId,String courseName,String duration,double fees){
            this.courseId = courseId;
            this.courseName = courseName;
            this.duration = duration;
            this.fees = fees;
        }
        void displayCourse(){
            System.out.println("Course ID:"+courseId);
            System.out.println("CourseName :"+courseName);
            System.out.println("Duration :"+duration);
            System.out.println("Fees :"+fees);

        }

    public static void main(String[] args) {
        Course c = new Course(258, "java", "2hours", 25000);
        c.displayCourse();
        
    }
}