package builder2;

import domain.Computer;

public class Test {

    public static void main(String[] args) {

        IComputerBuilder builder = new ComputerBuilder();
        Computer computer = builder.build();
        computer.start();
    }
}
