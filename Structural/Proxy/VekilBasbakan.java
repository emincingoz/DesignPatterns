package Structural.Proxy;

public class VekilBasbakan implements IBasbakan{

    private IBasbakan gercekBasbakan;

    public VekilBasbakan (IBasbakan gercekBasbakan) {
        this.gercekBasbakan = gercekBasbakan;
    }

    @Override
    public void dertDinle (String dert) {
        System.out.println("Vekil: Derdinizi dinliyorum.");

//        if (......)  // Butun kontroller burada yapilir.

        boolean ayiklandi = ayikla(dert);
        if (ayiklandi) {
            ilet(dert);
        }
    }

    @Override
    public void isBul (String yakinim) {
        System.out.println("Vekil: İsteğinizi dinliyorum.");
    }

    private boolean ayikla (String dert) {
        boolean b = true;
        // .....

        return b;
    }

    private void ilet (String dert) {
        gercekBasbakan.dertDinle(dert);
    }
}
