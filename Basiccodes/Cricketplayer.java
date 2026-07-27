class Cricketplayer{


    int playerId;
    String playerName ;
    String team;
    int runs;

    void  player(){
        System.out.println("PlayerId:"+playerId);
        System.out.println("PlayerNamw:"+playerName);
        System.out.println("Team:"+team);
        System.out.println("Runs:"+runs);
    }

    public static void main(String[] args) {
        Cricketplayer c = new Cricketplayer();
        c.playerId = 45;
        c.playerName= "sharukan";
        c.team = "rcb";
        c.runs = 79;

        c.player();

    }
}