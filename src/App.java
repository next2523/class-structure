public class App {
    public static void main(String[] args) throws Exception {
        Dog Hilary = new Dog("Curly", 69, "Blue", "Hilary", 80);
        Dog Hayden = new Dog("Straight", 4, "Brown", "Hayden", 30);
        Dog Levi = new Dog("Slightly Curly", 15, "Orange", "Levi", 167);

        goldenRetriever GoldenHilary = new goldenRetriever("Straight", 17, "Yellow", "Max", 267);
        goldenRetriever GoldenHayden = new goldenRetriever("Straight", 17, "Yellow", "Max", 267);
        goldenRetriever GoldenLevi = new goldenRetriever("Straight", 17, "Yellow", "Max", 267);

        Dog DefaultHilary = new Dog(defaultHair, defaultAge, defaultEyeColor, defaultName, defaultLifeExpectancy);

        // System.out.println(Hilary.getDog() + "\n");
        // System.out.println(Hayden.getDog() + "\n");
        // System.out.println(Levi.getDog() + "\n");

        // System.out.println(Hilary.nameAndAge());
        // System.out.println(Hayden.nameAndAge());
        // System.out.println(Levi.nameAndAge());

        // System.out.println(Hilary.lifeExpectancy());
        // System.out.println(Hayden.lifeExpectancy());
        // System.out.println(Levi.lifeExpectancy());

        // System.out.println(GoldenHayden.getGoldenRetriever());
        // System.out.println(GoldenHilary.getGoldenRetriever());
        // System.out.println(GoldenLevi.getGoldenRetriever());
    }
}