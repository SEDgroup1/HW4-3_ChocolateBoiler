public class BoilStep implements ChocolateBoilerStep {

    public void inputStep(String stepName) {
        if (stepName == "Boil") {
            System.out.println("Boil chocolate");
            ChocolateBoiler.getInstance().changeStep(new DrainStep());
        }
    }

}
