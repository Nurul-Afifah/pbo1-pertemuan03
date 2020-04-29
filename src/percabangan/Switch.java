package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs : \"Alhamdulillah, Terimakasih pak\"");
                System.out.println("Dosen : \"Selamat yaa !!\"");
                break;
            case 'B':
                System.out.println("Mhs : \"Terimakasih pak\"");
                System.out.println(("Dosen : \"Iyaa\""));
                break;
            case 'C':
                System.out.println("Mhs : \"Saya ikut kelas bapak terus, tugas mengerjakan terus juga\"");
                System.out.println("Dosen : \"Tapi waktu ujian ikut atau tidak?\"");
                System.out.println("Mhs : \"Tidak, maaf pak\'");
                break;
            default:
                System.out.println("Mhs : \"Saya ikut kelas bapak terus, tugas mengerjakan terus juga\"");
                System.out.println("Dosen : \"*memeriksa berkas\"");
                System.out.println("Dosen : \"Tidak ada!!!\"");
                System.out.println("Mhs : \"Menghilang...\"");
                break;
        }
    }
}
