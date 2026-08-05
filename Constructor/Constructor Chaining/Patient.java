class Patient{

       int patientId;
       String patientName;
       int age;
       String disease;
       String doctorName;

       Patient(){
        this(11);
        //this.patientId = patientId;
       }
       Patient(int patientId){
        this(11,"Sanjay");
        this.patientId = patientId;
       }
       Patient(int patientId, String patientName){
        this(11,"Sanjay",22);
        this.patientId = patientId;
        this.patientName = patientName;
       }
       Patient(int patientId, String patientName, int age){
        this(11,"Sanjay",22,"cancer");
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;

       }
        Patient(int patientId, String patientName, int age, String disease){
                this(11,"Sanjay",22,"cancer","san");
                this.patientId = patientId;
                this.patientName = patientName;
                this.age = age;
                this.disease = disease;

        }
         Patient(int patientId, String patientName, int age, String disease ,String doctorName){
            //this();
            this.patientId=patientId;
            this.patientName=patientName;
            this.age=age;
            this.disease=disease;
            this.doctorName=doctorName;
         }



    void displayPatient(){
        System.out.println("Patient ID :"+patientId);
        System.out.println("Patient Name :"+patientName);
        System.out.println("Age :"+age);
        System.out.println("Disease :"+disease);
        System.out.println("Doctor Name:"+doctorName);
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.displayPatient();

    }
}