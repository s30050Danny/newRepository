//TODO: we neeed to add the missing classes!
//Ok, I will add 'Adder' and s30050 will do 'Substractor'.

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Substractor substractor = new Substractor();
        System.out.println(substractor.substract(6, 3));

        Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.multiply(6, 2));

        Dividor dividor = new Dividor();
        System.out.println(dividor.divide(0, 1000));
    }
}
