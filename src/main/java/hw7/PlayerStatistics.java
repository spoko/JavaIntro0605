package hw7;

public class PlayerStatistics {
    private byte endurance;
    private byte sprint;
    private byte dribble;
    private byte passing;
    private byte shooting;

    public void setEndurance(byte endurance) {
        if (endurance >= 0 && endurance <= 100){
            this.endurance = endurance;
        }else {
            throw new RuntimeException("Value must be between 0 and 100");
        }
    }

    public void setSprint(byte sprint) {
        if (sprint >= 0 && sprint <= 100){
            this.sprint = sprint;
        }else {
            throw new RuntimeException("Value must be between 0 and 100");
        }
    }

    public void setDribble(byte dribble) {
        if (dribble >= 0 && dribble <= 100){
            this.dribble = dribble;
        }else {
            throw new RuntimeException("Value must be between 0 and 100");
        }
    }

    public void setPassing(byte passing) {
        if (passing >= 0 && passing <= 100){
            this.passing = passing;
        }else {
            throw new RuntimeException("Value must be between 0 and 100");
        }
    }

    public void setShooting(byte shooting) {
        if (shooting >= 0 && shooting <= 100){
            this.shooting = shooting;
        }else {
            throw new RuntimeException("Value must be between 0 and 100");
        }
    }

    public PlayerStatistics(byte endurance, byte sprint, byte dribble, byte passing, byte shooting){
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public byte getStats(){
        return (byte) ((endurance + sprint + dribble + passing + shooting) / 5);
    }
}
