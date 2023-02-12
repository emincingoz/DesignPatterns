package builder4;

public interface IComputerBuilder {

    IComputerBuilder buildRAM();

    IComputerBuilder buildCPU();

    IComputerBuilder buildHardDrive();

    IComputerBuilder buildGraphicCard();

    IComputerBuilder buildDisplay();

    IComputerBuilder buildMouse();

    IComputerBuilder buildKeyboard();

    Computer build();
}
