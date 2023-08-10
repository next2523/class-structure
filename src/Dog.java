public class Dog {

    private String hair;
    private Integer age;
    private String eye_color;

    public Dog(){
        this.hair = "";
        this.age = 0;
        this.eye_color = "";
    }

    public Dog(String hair, int age, String eye_color){
        this.hair = hair;
        this.age = age;
        this.eye_color = eye_color;
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

    public void setHair(String hair){
        this.hair = hair;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEyeColor(){
        this.eye_color = eye_color;
    }

    public String getDog(){
        return "Dog's age: " + age + "\nDog's Hair: " + hair + "\nDog's Eye Color: " + eye_color;
    }
}