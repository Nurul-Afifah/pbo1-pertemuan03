package string;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Tapin";

        System.out.println(kota);

        char[] nurulChar = { 'N','U','R','U','L' };
        String nurulString = new String(nurulChar);
        System.out.println(nurulString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,5));
    }
}
