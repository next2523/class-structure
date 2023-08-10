public class goldenRetriever extends Dog{
    
    private String hair;
    private Integer age;
    private String eye_color;
    private String name;
    private Integer life_expectancy;

    public goldenRetriever(){
        this.hair = "";
        this.age = 0;
        this.eye_color = "";
        this.name = "";
        this.life_expectancy = 0;
    }

    public goldenRetriever(String hair, int age, String eye_color, String name, int life_expectancy){
        this.hair = hair;
        this.age = age;
        this.eye_color = eye_color;
        this.name = name;
        this.life_expectancy = life_expectancy;
    }

    public void setHair(){
        this.hair = "Straight";
    }

    public void setAge(){
        this.age = 17;
    }

    @Override public void setEyeColor(){
        this.eye_color = "Yellow";
    }

    @Override public void setName(){
        this.name = "Max";
    }

    @Override public void setLifeExpectancy(){
        this.life_expectancy = 287;
    }

    public String getGoldenRetriever(){
        return name + "'s age: " + age + "\n" + name + "'s Hair: " + hair + "\n" + name + "'s Eye Color: " + eye_color + "\n" + name + "'s Life Expectancy: " + life_expectancy;
    }
}