package factoryPatternLab;

public class Main {

    public static void main(String[] args) {

        AbstractFactory appleJuice = new AppleJuiceFactory();
        AbstractFruit fruit = appleJuice.getFruit();
        AbstractKnifeSplitter knifeSplitter = appleJuice.getKnifeSplitter();
        AbstractJuiceMaker juiceMaker = appleJuice.getJuiceMaker();

        System.out.println(fruit);
        System.out.println(knifeSplitter);
        System.out.println(juiceMaker);
    }
}
