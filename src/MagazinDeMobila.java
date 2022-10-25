import java.util.Arrays;

public class MagazinDeMobila {
   public  String nume, adresa;
    Mobila [] mobile;
    public MagazinDeMobila() {
    }
    public MagazinDeMobila(String nume, String adresa, Mobila[] mobile) {
        this.nume = nume;
        this.adresa = adresa;
        this.mobile = mobile;
    }
    public MagazinDeMobila(String nume,String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "MagazinDeMobila{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", mobile=" + Arrays.toString(mobile) +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Mobila[] getMobile() {
        return mobile;
    }

    public void setMobile(Mobila[] mobile) {
        this.mobile = mobile;
    }
}
