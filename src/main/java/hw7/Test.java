package hw7;

public class Test {
    public static void main(String[] args) {
        Team barca = new Team("Barcelona");

        PlayerStatistics messiStats = new PlayerStatistics((byte) 75, (byte) 85, (byte) 84, (byte) 92, (byte) 67);
        Player messi = new Player("Messi", messiStats);

        PlayerStatistics piqueStats = new PlayerStatistics((byte) 95, (byte) 82, (byte) 82, (byte) 89, (byte) 68);
        Player pique = new Player("Pique", piqueStats);

        System.out.println("Rating before adding any players:");
        System.out.println(barca.getRating());

        barca.addPlayerToTheTeam(messi);
        System.out.println("Rating after adding Messi");
        System.out.println(barca.getRating());

        barca.addPlayerToTheTeam(pique);
        System.out.println("Rating after adding Pique");
        System.out.println(barca.getRating());

        barca.removePlayerFromTheTeam(pique);
        System.out.println("Rating after removing Pique");
        System.out.println(barca.getRating());
    }
}
