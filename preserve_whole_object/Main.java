package preserve_whole_object;

public class Main {
    
}

class Room {
    public boolean withinPlan(HeatingPlan plan) {
        return plan.withinRange(this);
    }
}

class HeatingPlan {
    private TempRange range;
    
    public boolean withinRange(Room room) {
        return (room.getLowestTemp() >= range.getLow() && room.getHighestTemp() <= range.getHigh());
    }
}