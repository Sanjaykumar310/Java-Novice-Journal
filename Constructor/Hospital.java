class Hospital{

        String hospitalName;
        String location;
        int numberOfDoctors;

     Hospital() {
        hospitalName = "SRM";
        location = "chennai";
        numberOfDoctors = 10;

    }
    void  displayHospital(){

        System.out.println("HospitalName :"+hospitalName);
        System.out.println("Location :"+location);
        System.out.println("NumberofDoctors :"+numberOfDoctors);

    }

        

    public static void main(String[] args) {

        Hospital h = new Hospital();
        h.displayHospital();
    }
}