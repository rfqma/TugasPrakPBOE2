public class Tabung extends Lingkaran {
    private double tinggi, hasilVol, hasilLuasP;

    public Tabung(double r, double t) {
        super(r);
        tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }


    public double hitungVolume() {
        return PHI * (super.getJari() * super.getJari()) * tinggi;
    }


    public double hitungLuasP() {
        return 2 * (PHI * super.getJari()) * (super.getJari() + tinggi);
    }
}
