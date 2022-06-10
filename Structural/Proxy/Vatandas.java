package Structural.Proxy;

public class Vatandas {

    private IBasbakan basbakan;

    public Vatandas (BasbakanlikKalemi kalem) {
        this.basbakan = kalem.banaBasbakaniVer();
    }

    public String derdiniAnlat () {
        basbakan.dertDinle("Bir derdim var...");

        return "Yasasiin!";
    }

    public String isIste () {
        basbakan.isBul("Oglum");

        return "Yasasiin!!";
    }
}
