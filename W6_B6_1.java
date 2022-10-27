import java.util.LinkedList;
import java.util.List;

public class W6_B6_1 {
    public String name;
    private List tricks;
    private String race;
    private int age;
    private int mood = 5;
    private static int nb_chiens = 0;


    public W6_B6_1(String name, List tricks, String race, int age){
        this.name = name;
        this.tricks = tricks;
        this.race = race;
        this.age = age;
        nb_chiens++;

    }

    public List getTricks(){
        return tricks;
    }

    public String getRace(){
        return race;
    }

    public int getAge(){
        return age;
    }

    public int getMood(){
        return mood;
    }

    public static int getNb_chiens(){
        return nb_chiens;
    }

    public void setTricks(List tricks){
        this.tricks = tricks;
    }

    public void setRace(String race){
        this.race = race;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setMood(int mood){
        this.mood = mood;
    }

    public void addTrick(String trick){
        LinkedList temp = new LinkedList(this.tricks);
        temp.add(trick);
        this.tricks = temp;
    }

    public void eat(){
        this.mood = mood +3;
    }

    public void leash(){
        this.mood --;
    }

    public String getOldest(W6_B6_1 other){
        if (other.getAge()<this.getAge()){
            return this.name + " est le chien le plus agé avec " + this.age + " ans";
        }
        else{
            return other.name + " est le chien le plus agé avec " + other.getAge() + " ans";
        }
    }

    @Override
    public String toString(){
        return this.name + " a " + this.age + " ans, est un " + this.race + " et a und humeur de " +
        this.mood + ". Il sait faire les tours suivants: " + this.tricks;
    }

    public static void main(String[] args){
        W6_B6_1 lola = new W6_B6_1("Lola", List.of("rollover"), "Bouvier", 10);
        W6_B6_1 tobi = new W6_B6_1("Tobi", List.of("rollover", "do a barrel"), "Doggo", 17);
        System.out.println(lola.getAge());
        System.out.println(lola.getMood());
        System.out.println(lola.getRace());
        System.out.println(lola.name);
        System.out.println(lola.getTricks());
        lola.setAge(13);
        lola.setMood(8);
        lola.setRace("Bouvier");
        lola.name = "lola";
        lola.setTricks(List.of("rollover", "do a barrel"));
        lola.eat();
        lola.leash();
        lola.addTrick("sit");
        System.out.println(W6_B6_1.getNb_chiens());
        System.out.println(lola.getOldest(tobi));
        System.out.println(lola);
    }
}
