public class FillStep implements ChocolateBoilerStep{

    public void inputStep(String stepName) {
        if (stepName == "Fill") {
            System.out.println("Fill chocolate");
            ChocolateBoiler.getInstance().changeStep(new BoilStep());
        }
    }

}
