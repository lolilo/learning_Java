interface Animal {
    public void eat();
    public void travel();
}

public class MammalImplementingAnimalInterface implements Animal {
    public void eat() {
        System.out.println("Mammal eats.");
    }

    public void travel() {
        System.out.println("Mammal travels.");
    }

    public int numberOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        MammalImplementingAnimalInterface m = new MammalImplementingAnimalInterface();
        m.eat();
        m.travel();
    }
}