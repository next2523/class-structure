public class Dog {

    private String hair;
    private Integer age;
    private String eye_color;
    private String name;
    private Integer life_expectancy;

    public Dog(){
        this.hair = "";
        this.age = 0;
        this.eye_color = "";
        this.name = "";
        this.life_expectancy = 0;
    }

    public Dog(String hair, int age, String eye_color, String name, int life_expectancy){
        this.hair = hair;
        this.age = age;
        this.eye_color = eye_color;
        this.name = name;
        this.life_expectancy = life_expectancy;
    }

    public String getHair(){
        return hair;
    }

    public Integer getAge(){
        return age;
    }

    public String getEyeColor(){
        return eye_color;
    }

    public String getName(){
        return name;
    }

    public int getLifeExpectancy(){
        return life_expectancy;
    }

    public void setHair(String hair){
        this.hair = hair;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEyeColor(){
        this.eye_color = eye_color;
    }
    
    public void setName(){
        this.name = name;
    }

    public void setLifeExpectancy(){
        this.life_expectancy = life_expectancy;
    }

    public String getDog(){
        return name + "'s age: " + age + "\n" + name + "'s Hair: " + hair + "\n" + name + "'s Eye Color: " + eye_color + "\n" + name + "'s Life Expectancy: " + life_expectancy;
    }

    public String nameAndAge(){
        return name + "'s Name: " + name + "\n" + name + "'s age: " + age;
    }

    public String lifeExpectancy(){
        return name + "'s Life Expectancy: " + life_expectancy;
    }
}