import java.util.Scanner;

public class App {        

    public static void main(String[] args) throws Exception {
        int i, j, bedaEl = 0;
        Scanner sn = new Scanner(System.in);

        System.out.println("Memandingkan Isi array");
        System.out.println("------------------------");
        
        System.out.print("Masukkan Jumlah maksimal perbedaan elemen = ");
        int pembeda = sn.nextInt();

        System.out.println("Masukkan nilai Ordo");
        
        // Input Ordo Panjang
        System.out.print("Ordo Panjang: ");
        int ordoP = sn.nextInt();

        // Input Ordo Lebar
        System.out.print("Ordo Lebar: ");
        int ordoL = sn.nextInt();
        
        System.out.println("\nOrdo : " + ordoP + "x" + ordoL);

        // Array 1
        System.out.println("Masukkan Nilai data Array 1");
        int arr1[][] = new int[ordoP][ordoL];
        for(i = 0; i < ordoP; i++){
            for(j = 0; j < ordoP; j++){
                System.out.print("["+ i + "][" + j + "] = ");
                arr1[i][j] = sn.nextInt();
            }
        }

        // Array 2
        System.out.println("\nMasukkan Nilai data Array 2");
        int arr2[][] = new int[ordoP][ordoL];
        for(i = 0; i < ordoP; i++){
            for(j = 0; j < ordoP; j++){
                System.out.print("["+ i + "][" + j + "] = ");
                arr2[i][j] = sn.nextInt();
            }
        }

        // Print Array 1
        System.out.println("\nArray 1");
        for(i = 0; i < ordoP; i++) { 
            for(j = 0; j < ordoP; j++){
                System.out.print(arr1[i][j] + "\t");
            }        
            System.out.print("\n");
        }

        // Print Array 1
        System.out.println("\nArray 2");
        for(i = 0; i < ordoP; i++) {
            for(j = 0; j < ordoP; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.print("\n");
        }

        // Hitung Beda Elemen        
        for(i = 0; i < ordoP; i++) {
            for(j = 0; j < ordoP; j++){
                if(arr1[i][j] != arr2[i][j]) {
                    bedaEl++;
                }
            }            
        }
        System.out.println("\nBeda Elemen = " + bedaEl);

        // Hasil
        System.out.print("\nHasilnya array 1 dan array 2 = ");
        if(bedaEl > pembeda) {
            System.out.println("Tidak Mirid");
        } else {
            System.out.println("Mirip");
        }
    }    
}
