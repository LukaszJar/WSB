public class Car {
    final String producent;
    final String model;
    Double millage;
    String color;

    public Car(String producent, String model){
        this.producent=producent;
        this.model = model;

        public String toString(){
            return "Producent: " + this.producent
                    + "Model: " + this.model;
        }
    }

}
