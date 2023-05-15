import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String args[]){
        if (args.length < 1) {
            System.out.println("Input Error");
            System.exit(1);
        }

        ChocolateBoiler.getInstance().setInitialStep(new FillStep());

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] tokens = line.split(" ");

                switch (tokens[0]) {
                    case "Fill":
                        ChocolateBoiler.getInstance().inputStep("Fill");
                        break;
                    case "Boil":
                        ChocolateBoiler.getInstance().inputStep("Boil");
                        break;
                    case "Drain":
                        ChocolateBoiler.getInstance().inputStep("Drain");
                        break;

                    default:
                        System.out.println("Input Error");
                        break;
                }

            }
            reader.close();
        }
        catch (Exception e) {
            System.out.println("Input Error");
        }
    }

}