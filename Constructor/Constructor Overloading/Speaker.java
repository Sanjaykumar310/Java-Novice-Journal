class Speaker{

        int speakerId;
        String brand;
        int watt;
        double price;

        public Speaker(){

        }
        public Speaker(int  speakerId,String brand, int watt){
            this.speakerId = speakerId;
            this.brand = brand;
            this.watt = watt;

        }
        public Speaker(int  speakerId, String brand ,int watt,double price){
            this.speakerId = speakerId;
            this.brand = brand;
            this.watt = watt;
            this.price = price;

        }

    void  displaySpeaker(){
        System.out.println("Speaker ID :"+speakerId);
        System.out.println("Brand :"+brand);
        System.out.println("Watt :"+watt);
        System.out.println("Price :"+price);
    }
    public static void main(String[] args) {
        Speaker s = new Speaker();
        s.displaySpeaker();
        Speaker s1 = new Speaker(20, "JBL", 100);
        s1.displaySpeaker();
        Speaker s2 = new Speaker(21, "SONY", 200, 150000);
        s2.displaySpeaker();
        
    }
}