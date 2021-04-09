package operator;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 50000;
        double uangDiDompet = 50000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, Kurangi jajanan anda");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("uang cukup, angsul : "+angsul);
        }else {
            System.out.println("Uang pas.. UwU..");
        }
    }
}
