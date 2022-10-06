package domain;

public class Car {

    private int distance;

    public void move(final MoveAbleStrategy moveAbleStrategy) {
        distance = distance + moveAbleStrategy.getMoveDistance();
    }

    public int getDistance() {
        return this.distance;
    }
}
