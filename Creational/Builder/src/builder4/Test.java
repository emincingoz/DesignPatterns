package builder4;

public class Test {

    public static void main(String[] args) {

        Computer bareBoneComputer = Computer.getBuilder("barebone computer").buildCPU().buildRAM().buildHardDrive().build();
        bareBoneComputer.start();

        //Computer computer3 = new Computer(); // Neither this nor set methods can be called!
    }
}
