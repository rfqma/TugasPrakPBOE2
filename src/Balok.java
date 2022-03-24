public class Balok extends PersegiPanjang {
    private double tinggi, hasilVol, hasilLuasP;

    public Balok(double p, double l, double t){
        super(p , l);
        tinggi = t;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }


    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }


    public double hitungLuasP() {
        return 2 * (super.hitungLuas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
}
