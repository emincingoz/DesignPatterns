package builder1;

import domain.*;

public interface IComputerBuilder {

    RAM buildRAM();
    CPU buildCPU();
    HardDrive buildHardDrive();
    GraphicCard buildGraphicCard();
    Display buildDisplay();
    Computer buildComputer();
}
