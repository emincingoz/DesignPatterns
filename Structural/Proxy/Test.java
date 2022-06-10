package Structural.Proxy;

public class Test {
    public static void main(String[] args) {
        System.err.println("*** Vatandaş başkanlık kalemine gelir ve süreç başlar. ***");

        IBasbakan basbakan = new GercekBasbakan();
        BasbakanlikKalemi kalem = new BasbakanlikKalemi(basbakan);

        Vatandas riza = new Vatandas(kalem);
        // Vatandaş derdini anlattığında vekil başbakan dinledi önce daha sonra gerçek başbakana iletti
        riza.derdiniAnlat();
        // Vatandaş iş istediğinde vekil başbakan dinledi önce ama gerçek başbakana iletmedi.
        riza.isIste();
    }
}
