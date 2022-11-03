package domain;

public class Car {

    private int distance;
    private String name;

    public Car(final int distance, final String name) {
        this.distance = distance;
        validateName(name);
        this.name = name.trim();
    }

    private void validateName(final String name) {
        if (name.isBlank()) {
            throw new NullPointerException("자동차 이름이 비어있습니다.");
        }
        if (name.length() > 5) {
            throw new NullPointerException("자동차 이름은 5를 초과해서는 안됩니다.");
        }
    }

    public void move(final MoveAbleStrategy moveAbleStrategy) {
        distance = distance + moveAbleStrategy.getMoveDistance();
    }

    public int getDistance() {
        return this.distance;
    }
  
    public String getName() {
        return this.name;
    }

    public boolean isEqualsDistance(final int distance) {
        return this.distance == distance;
    }
}
