package builder1;

import domain.Display;
import domain.RAM;

public class Test {

    public static void main(String[] args) {

        IComputerBuilder builder = new ComputerBuilder();
//		Computer computer = builder.buildComputer();
//		computer.start();

        RAM ram = builder.buildRAM();
        Display display = builder.buildDisplay();

    }
}
