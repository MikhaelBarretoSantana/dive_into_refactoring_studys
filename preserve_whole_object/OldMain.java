package preserve_whole_object;

public class OldMain {
    
}

class Room {
    public boolean withinPlan(HeatingPlan plan) {
        int low = getLowestTemp();
        int hight = getHighestTemp();
        return plan.withinRange(low, hight);
    }
}

class HeatingPlan {
    private TempRange range;
    
    public boolean withinRange(int low, int hight) {
        return (low >= range.getLow() && hight <= range.getHigh());
    }
}