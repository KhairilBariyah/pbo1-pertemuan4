package contohkasus.perulangan;

public class While {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + "ml");

        while (isiGelas != penuh){
            isiGelas++;
            System.out.println("Sedang mengisi Gelas..");
            System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        }

        System.out.println("Finale: Isi Gelas Sekarang : " + isiGelas + "ml");
    }
}