package Structural.Proxy;

public class BasbakanlikKalemi {

    private IBasbakan basbakan;

    public BasbakanlikKalemi (IBasbakan basbakan) {
        this.basbakan = new VekilBasbakan(basbakan);
    }

    public IBasbakan banaBasbakaniVer () {
        System.out.println("Basbakanlik Kalemi: Tabii ki efendim.");

        return this.basbakan;
    }
}
