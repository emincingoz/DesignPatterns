package builder3;

import domain.Computer;

public class Test {

    public static void main(String[] args) {

        IComputerBuilder builder = ComputerBuilder.getBuilder();
        Computer computer1 = builder.buildRAM().buildHardDrive().buildGraphicCard().buildDisplay().buildCPU().build();
        computer1.start();

        Computer computer2 = builder.buildRAM().buildHardDrive().buildGraphicCard().buildDisplay().buildCPU().buildMouse().buildKeyboard().build();
        computer2.start();

        Computer computer3 = new Computer(); // This as well as set methods can be called!
    }
}
