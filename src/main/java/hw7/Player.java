package hw7;

public class Player {
    private String name;
    private PlayerStatistics stats;

    public String getName(){
        return name;
    }

    private void setName(String name){
        if (!name.isEmpty()){
            this.name = name;
        }else {
            //todo throw exception
        }
    }

    public void setStats(PlayerStatistics stats){
        if (stats != null){
            this.stats = stats;
        }else {
        //todo throw exception
        }
    }

    public byte getOverallSkill(){
        return stats.getStats();
    }

    public Player(String name, PlayerStatistics stats){
        setName(name);
        setStats(stats);
    }
}
