
public class Billard_KugelLager 
{
    Kugel[] KugelLager;
    public Billard_KugelLager()
    {
        KugelLager = new Kugel[15];
        Kugel Kugel1 = new Kugel(1, "gelb", false);
        Kugel Kugel2 = new Kugel(2, "blau", false);
        Kugel Kugel3 = new Kugel(3, "rot", false);
        Kugel Kugel4 = new Kugel(4, "lila", false);
        Kugel Kugel5 = new Kugel(5, "orange", false);
        Kugel Kugel6 = new Kugel(6, "gruen", false);
        Kugel Kugel7 = new Kugel(7, "magenta", false);
        Kugel Kugel8 = new Kugel(8, "schwarz", false);
        Kugel Kugel9 = new Kugel(9, "gelb", true);
        Kugel Kugel10 = new Kugel(10, "blau",true);
        Kugel Kugel11 = new Kugel(11, "rot",true);
        Kugel Kugel12 = new Kugel(12, "lila", true);
        Kugel Kugel13 = new Kugel(13, "orange", true);
        Kugel Kugel14 = new Kugel(14, "gruen", true);
        Kugel Kugel15 = new Kugel(15, "magenta", true);
        LegeKugelInsLagerAb(0, Kugel5);
        LegeKugelInsLagerAb(1, Kugel1);
        LegeKugelInsLagerAb(2, Kugel4);
        LegeKugelInsLagerAb(3, Kugel2);
        LegeKugelInsLagerAb(4, Kugel9);
        LegeKugelInsLagerAb(5, Kugel10);
        LegeKugelInsLagerAb(6, Kugel7);
        LegeKugelInsLagerAb(7, Kugel3);
        LegeKugelInsLagerAb(8, Kugel15);
        LegeKugelInsLagerAb(9, Kugel6);
        LegeKugelInsLagerAb(10, Kugel8);
        LegeKugelInsLagerAb(11, Kugel11);
        LegeKugelInsLagerAb(12, Kugel13);
        LegeKugelInsLagerAb(13, Kugel14);
        LegeKugelInsLagerAb(14, Kugel12);

    }

    public void LegeKugelInsLagerAb(int n, Kugel AbzulegendeKugel){
        KugelLager[n] = AbzulegendeKugel;
    }

    public Kugel getKugelAnStelleAusDemLager(int n){
        return KugelLager[n];
    }

    public void Bubbelsort(){
        boolean switched = false;
        int laengeDesKugelLagers = KugelLager.length;
        do{
            switched = false; 
            for(int i = 0; i < laengeDesKugelLagers - 1; i++){
                if(KugelLager[i].getZahl() > KugelLager[i+1].getZahl()){
                    Kugel KopieZuVergleichendeKugel = KugelLager[i];
                    KugelLager[i] = KugelLager[i+1];
                    KugelLager[i+1] = KopieZuVergleichendeKugel;
                    switched = true; 
                }
            }
            laengeDesKugelLagers = laengeDesKugelLagers -1;
        }while(switched == true);
    }

    public void Insertionsort(){
        for(int i = 0; i < KugelLager.length -1; i++){
            int zuSortierendePoition = i+1; //Bereichsidee - in den unsortieren Bereich kommen
            Kugel KopiezuSortierendesObjekt = KugelLager[zuSortierendePoition];
            while(zuSortierendePoition > 0 && KugelLager[zuSortierendePoition-1].getZahl() > KopiezuSortierendesObjekt.getZahl()){
                KugelLager[zuSortierendePoition] = KugelLager[zuSortierendePoition-1]; //höhere Kugel eins höher Schieben
                zuSortierendePoition--; //Bereich verschieben
            }
            KugelLager[zuSortierendePoition] = KopiezuSortierendesObjekt; //Sortierendekugel einsetzten
        }
    }

    public void Selectionsort(){
        for(int i = 0; i < KugelLager.length -1; i++){
            for(int j = i+1; j < KugelLager.length; j++){
                if(KugelLager[j].getZahl() < KugelLager[i].getZahl()){
                    Kugel KopieDerZuTauschendenKugel = KugelLager[i];
                    KugelLager[i] = KugelLager[j];
                    KugelLager[j] = KopieDerZuTauschendenKugel;
                }
            }
        }
    }
}

