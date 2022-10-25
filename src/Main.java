import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MagazinDeMobila mag[] = new MagazinDeMobila[2];
        creare(mag);
        for(MagazinDeMobila m: mag)
            System.out.println(m);
        System.out.println();

        pret_minim(mag);
        System.out.println();

        String [] lista = {"lemn"};
        System.out.println(descriere(mag,lista));
    }
    public static void creare(MagazinDeMobila[] mag)
    {
        Mobila[] mob1= new Mobila [2];

        mob1[0]= new Mobila("Canapele 3-2-1","comode si elegante","catifea",20,50,200,5000);
        mob1[1]= new Mobila("Birou","lemn","compact",50,50,100,700);


        Mobila[] mob2 = new Mobila[2];
        mob2[0]= new Mobila("Biblioteca","pentru camere mari","lemn de stejar",100,150,200,1000);
        mob2[1]= new Mobila("Scaune","cu spatar","plastic",20,50,50,1000);


        mag[0] = new MagazinDeMobila("VidaXL", "Bulevardul Eroilor",mob1);
        mag[1] = new MagazinDeMobila("Moblet","Iulius Mall",mob2);

    }

    public static void pret_minim(MagazinDeMobila[] magazine) {
        double min = magazine[0].getMobile()[0].getPret();
        for(MagazinDeMobila m : magazine)
            for(Mobila mob: m.getMobile())
                if(mob.getPret() < min)
                    min = mob.getPret();
        List<String> nume_magazin = new ArrayList<>();
        System.out.println("Cel mai mic pret este: " + min + " la : ");
        for(MagazinDeMobila m : magazine)
            for(Mobila mob: m.getMobile())
                if (mob.getPret() == min && ! nume_magazin.contains(m.getNume()))
                    nume_magazin.add(m.getNume());

        String[] nume = new String[nume_magazin.size()];
        nume = nume_magazin.toArray(nume);
        for(String s : nume)
            System.out.println(s);
    }
    public static int descriere(MagazinDeMobila[] magazine, String[] cuvinte) {
        int nr=0;
        List <Mobila> unic = new ArrayList<>();
        for(String s : cuvinte) {
            for(MagazinDeMobila mag : magazine)
                for(Mobila mob : mag.getMobile())
                    if(mob.getDescriere().contains(s) && ! unic.contains(mob)) {
                        nr++;
                        unic.add(mob);
                    }
        }
        return nr;
    }
}