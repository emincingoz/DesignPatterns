package builder4;

import domain.*;

public class Computer {
    private String name;
    private CPU cpu;
    private RAM ram;
    private HardDrive hd;
    private GraphicCard graphicCard;
    private Display display;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
    }

    public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
    }

    public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display, Keyboard keyboard) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
        this.keyboard = keyboard;
    }

    public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display, Keyboard keyboard, Mouse mouse) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void start() {
        cpu.start();
        ram.loadOSKernelImage();
        ram.loadOS();
        ram.loadDrivers();
        ram.startServices();
        hd.start();
        if (graphicCard != null)
            graphicCard.start();
        if (display != null)
            display.start();
        if (keyboard != null)
            keyboard.start();
        if (mouse != null)
            mouse.start();
        System.out.println("Computer " + name + " has started.\n");
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public HardDrive getHd() {
        return hd;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public static IComputerBuilder getBuilder(String name) {
        return new ComputerBuilder(name);
    }

    public static class ComputerBuilder implements IComputerBuilder {

        private String name;
        private CPU cpu;
        private RAM ram;
        private HardDrive hd;
        private GraphicCard graphicCard;
        private Display display;
        private Keyboard keyboard;
        private Mouse mouse;

        private ComputerBuilder(String name) {
            this.name = name;
        }

        @Override
        public IComputerBuilder buildRAM() {
            this.ram = new RAM();
            return this;
        }

        @Override
        public IComputerBuilder buildCPU() {
            this.cpu = new CPU();
            return this;
        }

        @Override
        public IComputerBuilder buildHardDrive() {
            this.hd = new HardDrive();
            return this;
        }

        @Override
        public IComputerBuilder buildGraphicCard() {
            this.graphicCard = new GraphicCard();
            return this;
        }

        @Override
        public IComputerBuilder buildDisplay() {
            this.display = new Display();
            return this;
        }

        @Override
        public IComputerBuilder buildMouse() {
            this.mouse = new Mouse();
            return this;
        }

        @Override
        public IComputerBuilder buildKeyboard() {
            this.keyboard = new Keyboard();
            return this;
        }

        @Override
        public Computer build() {
            Computer computer = new Computer(this.name, this.cpu, this.ram, this.hd, this.graphicCard, this.display,
                    this.keyboard, this.mouse);
            return computer;
        }
    }
}
