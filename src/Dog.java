public class Dog {

    private String hair;
    private Integer age;
    private String eye_color;
    private String name;

    public Dog(){
        this.hair = "";
        this.age = 0;
        this.eye_color = "";
        this.name = "";
    }

    public Dog(String hair, int age, String eye_color, String name){
        this.hair = hair;
        this.age = age;
        this.eye_color = eye_color;
        this.name = name;
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

    public String getDog(){
        return name + "'s age: " + age + "\n" + name + "'s Hair: " + hair + "\n" + name + "'s Eye Color: " + eye_color;
    }
}