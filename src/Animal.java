public class Animal {

    static final public Double DEFAULT_DOG_WEIGHT = 12.3;
    private static final Double DEFAULT_CAT_WEIGHT = 5.6;
    String specie;
    String name;
    Boolean isAlive;
    Double weight;

    Animal(String specie) {
        this.specie = specie;
        this.isAlive = true;

        switch (specie) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            default -> this.weight = 1.0;
        }


    }

    void feed() {
        if (isAlive == true) {
            this.weight = weight + 5;
            System.out.println("dzieki za zarcie  " + weight);

        }else{

            System.out.println("Czy wszystko dobrze z głową?");
        }
    }

    void takeForAWalk() {
        if (isAlive == true) {
            this.weight = weight - 5;
            System.out.println("dzieki za spacer");}
            else {
                System.out.println("Dzwonie na policje");
            }
        }
    }

