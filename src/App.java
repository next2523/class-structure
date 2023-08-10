public class App {
    public static void main(String[] args) throws Exception {
        Dog Hilary = new Dog("Curly", 69, "Blue");
        Dog Hayden = new Dog("Straight", 4, "Brown");
        Dog Levi = new Dog("Slightly Curly", 15, "Orange");

        System.out.println(Hilary.getDog() + "\n");
        System.out.println(Hayden.getDog() + "\n");
        System.out.println(Levi.getDog() + "\n");
    }
}