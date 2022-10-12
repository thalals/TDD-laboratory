package domain;

import java.util.ArrayList;
import java.util.List;


public class GameSet {

    private final int count;
    private final List<Car> carList;

    public GameSet(final int cars, final int count) {
        this.count = count;
        carList = List.copyOf(createCars(cars));
    }

    private List<Car> createCars(final int size) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Car());
        }
        return list;
    }

    public int getCount() {
        return this.count;
    }

    public List<Car> getCarList(){
        return this.carList;
    }
}
