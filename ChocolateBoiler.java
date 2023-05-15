public class ChocolateBoiler {
    private static ChocolateBoiler instance;
    private ChocolateBoilerStep step;

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void setInitialStep(ChocolateBoilerStep intialStep) {
        step = intialStep;
    }

    public void changeStep(ChocolateBoilerStep newStep) {
        step = newStep;
    }

    public void inputStep(String stepName) {
        step.inputStep(stepName);
    }
}