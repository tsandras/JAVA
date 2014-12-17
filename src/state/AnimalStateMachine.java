package state;

public class AnimalStateMachine {

    public static void changeStep(IStateHealth statedReference) {
        statedReference.setState(statedReference.getState().getNextStepState());
    }
}
