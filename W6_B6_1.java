import java.util.List;

public class W6_B6_1 { //gemäss Aufgabenstellung: W6_B6_1 an allen Positionen mit Dog ersetzten
    public String name;
    private List tricks;
    private String race;
    private int age;
    private int mood;
    private static int nb_chiens;


    void setDog(String name, List tricks, String race, int age){
        this.name = name;
        this.tricks = tricks;
        this.race = race;
        this.age = age;

    }
    String getName(){
        return name;
    }

    List getTricks(){
        return tricks;
    }

    String getRace(){
        return race;
    }

    int getAge(){
        return age;
    }


    public static void main(String[] args){
        W6_B6_1 myDog = new W6_B6_1();
        myDog.setDog("Bello", List.of("Handstand", "Sit", "Stay"), "Mops", 26);

        W6_B6_1 hisDog = new W6_B6_1();
        hisDog.setDog("Peter", List.of("Sit", "Stay", "Go"), "Deutscher Schäferhund", 2);
     
        System.out.println("His Name is: " + myDog.getName());
        System.out.println("He can do: " + myDog.getTricks());
        System.out.println("He is a " + myDog.getRace());
        System.out.println("He is already " + myDog.getAge() + " years old.");

        System.out.println("His Name is: " + hisDog.getName());
        System.out.println("He can do: " + hisDog.getTricks());
        System.out.println("He is a " + hisDog.getRace());
        System.out.println("He is already " + hisDog.getAge() + " years old.");

    }

}
