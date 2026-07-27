class Hospital{
    String HospitalName;
    String Location;
    int NumberofDoctors;

    void displayHospital(){
        System.out.println("HospitalName:"+HospitalName);
        System.out.println("Location:"+Location);
        System.out.println("NumberofDoctors:"+NumberofDoctors);
    }

    public static void main(String[] args) {
        Hospital h = new Hospital();
        h.HospitalName = "SS";
        h.Location="chennai";
        h.NumberofDoctors = 5;

        h.displayHospital();
    }
}