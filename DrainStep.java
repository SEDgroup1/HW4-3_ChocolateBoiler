public class DrainStep implements ChocolateBoilerStep {

    public void inputStep(String stepName) {
        if (stepName == "Drain") {
            System.out.println("Drain the boiled chocolate");
            ChocolateBoiler.getInstance().changeStep(new FillStep());
        }
    }

}
