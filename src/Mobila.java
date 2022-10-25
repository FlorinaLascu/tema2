public class Mobila {
    public String nume, descriere, material;
   public double lungime,inaltime,latime,pret;

    public Mobila(String nume, String descriere, String material, double lungime, double inaltime, double latime, double pret) {
        this.nume = nume;
        this.descriere = descriere;
        this.material = material;
        this.lungime = lungime;
        this.inaltime = inaltime;
        this.latime = latime;
        this.pret = pret;
    }

    public Mobila() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Mobila{" +
                "nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", material='" + material + '\'' +
                ", lungime=" + lungime +
                ", inaltime=" + inaltime +
                ", latime=" + latime +
                ", pret=" + pret +
                '}';
    }
}
