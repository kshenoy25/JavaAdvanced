package JavaCustomAnnoations;

@VeryImportant
public class Cat {
    @ImportantString
    String name;
    int age;



    public Cat(String name){
        this.name = name;
    }
    @RunImmediately(times = 3)
    public void meoow(){
        System.out.println("Meow");
    }
    public void eat(){
        System.out.println("Nom");
    }
}
