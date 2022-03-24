import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int ulang;
        do {
            System.out.println("Pilih: ");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");

            System.out.print("Pilih: ");
            int pilih = in.nextInt();

            switch(pilih){
                case 1:
                    double p, l, t;
                    System.out.print("Panjang: ");
                    p = in.nextInt();
                    System.out.print("Lebar: ");
                    l = in.nextInt();
                    System.out.print("Tinggi: ");
                    t = in.nextInt();
                    Balok b = new Balok(p, l, t);

                    System.out.println("Luas Persegi Panjang= " + b.hitungLuas());
                    System.out.println("Keliling Persegi Panjang= " + b.hitungKeliling());
                    System.out.println("Volume Balok= " + b.hitungVolume());
                    System.out.println("Luas Permukaan Balok= " + b.hitungLuasP());
                    break;
                case 2:
                    double r;
                    System.out.print("Tinggi: ");
                    t = in.nextInt();
                    System.out.print("Jari - jari: ");
                    r = in.nextInt();
                    Tabung tbg = new Tabung(r, t);

                    System.out.println("Luas Lingkaran= " + tbg.hitungLuas());
                    System.out.println("Keliling Lingkaran= " + tbg.hitungKeliling());
                    System.out.println("Volume Tabung= " + tbg.hitungVolume());
                    System.out.println("Luas Permukaan Tabung= " + tbg.hitungLuasP());
            }
            System.out.print("Ulang? (Ya= 1/Tidak= 0) : ");
            ulang = in.nextInt();

        } while(ulang == 1);
    }
}
