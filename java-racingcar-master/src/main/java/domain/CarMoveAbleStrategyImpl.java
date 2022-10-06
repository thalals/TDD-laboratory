package domain;

import java.util.Random;

public class CarMoveAbleStrategyImpl implements MoveAbleStrategy {

    private static final Random random = new Random();
    private static final int NUMBER_OF_ADVANCES = 4;
    private static final int RANDOM_BOUND = 10;

    @Override
    public int getMoveDistance() {
        if(isRun(random.nextInt(RANDOM_BOUND))){
            return 1;
        }
        return 0;
    }

    private boolean isRun(final int randomNumber) {
        return randomNumber > NUMBER_OF_ADVANCES;
    }
}
