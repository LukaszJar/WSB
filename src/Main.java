public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.weight = 12.3;
        dog.name = "Sarik";
        dog.isAlive = false;
        dog.specie = "canis";

        System.out.println(dog.specie);
        dog.feed();


        Human me= new Human();
        me.firstName = "Łukasz";
        me.lastName = "Jarebski";
        me.pet = dog;
        System.out.println(me.pet.name);
        dog.takeForAWalk();

    Car passerai = new Car ("VW", "Passat");
    passerai.millage = 500000.0;

        System.out.println(passerai.producent);
        System.out.println(passerai.model);
        System.out.println(passerai);

    }
}