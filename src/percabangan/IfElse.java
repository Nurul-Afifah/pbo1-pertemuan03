package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangdiDompet = 53000;

        if (uangdiDompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");
        }else if(uangdiDompet>totalBelanja) {
            double kembalian = uangdiDompet-totalBelanja;
            System.out.println("Uang cukup, kembaliannya : " + kembalian);
        }else{
            System.out.println("Uang pas... uwu...");
        }
    }
}
