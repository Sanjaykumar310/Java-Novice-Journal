class University{


        int universityId;
        String universityName;
        String location;
        int ranking;

        University(int universityId,String universityName,String location,int ranking){
            this.universityId = universityId;
            this.universityName = universityName;
            this.location = location;
            this.ranking = ranking;
        }

        void  displayCollege(){
            System.out.println("University ID :"+universityId);
            System.out.println("UnoversityName :"+universityName);
            System.out.println("Location :"+location);
            System.out.println("Ranking :"+ranking);
        }

        public static void main(String[] args) {
            University u = new University(123, "PEC","Chennai", 25);

            u.displayCollege();
        }
}