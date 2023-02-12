package builder3;

import domain.*;

public class ComputerBuilder implements IComputerBuilder {

    private static ComputerBuilder builder = new ComputerBuilder();

    private Computer computer;

    private ComputerBuilder(){
        computer = new Computer();
    }

    public static ComputerBuilder getBuilder() {
        return builder;
    }

    @Override
    public IComputerBuilder buildRAM() {
        RAM ram = new RAM();
        computer.setRam(ram);
        return builder;
    }

    @Override
    public IComputerBuilder buildCPU() {
        CPU cpu = new CPU();
        computer.setCpu(cpu);
        return builder;
    }

    @Override
    public IComputerBuilder buildHardDrive() {
        HardDrive hd = new HardDrive();
        computer.setHd(hd);
        return builder;
    }

    @Override
    public IComputerBuilder buildGraphicCard() {
        GraphicCard card = new GraphicCard();
        computer.setGraphicCard(card);
        return builder;
    }

    @Override
    public IComputerBuilder buildDisplay() {
        Display display = new Display();
        computer.setDisplay(display);
        return builder;
    }

    @Override
    public IComputerBuilder buildMouse() {
        Mouse mouse = new Mouse();
        computer.setMouse(mouse);
        return builder;
    }

    @Override
    public IComputerBuilder buildKeyboard() {
        Keyboard keyboard = new Keyboard();
        computer.setKeyboard(keyboard);
        return builder;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
