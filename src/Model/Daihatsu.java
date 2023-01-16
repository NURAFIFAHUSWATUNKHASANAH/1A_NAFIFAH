package Model;

public class Daihatsu {
    public static void main(String[] args) {
        Mobil Zebra= new Mobil(4,1200,"kulit");
        Zebra.NyalakanMesin();
        boolean HariGelap=true;
        if(HariGelap){
            Zebra.NyalakanLampu();
        }

    }
}
