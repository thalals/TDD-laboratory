
public class Car {

    private int distance;

    public void move(final boolean runnable) {
        if(runnable){
            distance = distance + 1;

        }
    }

    public int getDistance() {
        return this.distance;
    }
}
