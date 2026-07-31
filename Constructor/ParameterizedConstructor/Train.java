class Train{

        int trainNo;
        String trainName;
        String source;
        String destination;

    public Train(int trainNo,String trainName,String source,String destination) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
    }

    void displayTrain(){
        System.out.println("TrainNo :"+trainNo);
        System.out.println("TrainName :"+trainName);
        System.out.println("Source :"+source);
        System.out.println("Destination :"+destination);
    }

        

    public static void main(String[] args) {
        Train t = new Train(1012,"Vantheya Bharat","IRCTC","delhi");
        t.displayTrain();
        
    }
}