package percabangan;

public class Switch {
    public static void main(String[] args) {
        int sifat = 3;
        switch (sifat){
            case 1:
                System.out.println("orang baik");
                break;
            case 2:
                System.out.println("orang pintar");
                break;
            case 3:
                System.out.println("orang sopan");
                break;
            case 4:
                System.out.println("orang santun");
                break;
            default:
                System.out.println("sifat manusia");
                break;
        }
    }
}
