public class piramida2 {
    public static void main (String [] args){
    System.out.println("Nama : Rizqi Hendra Ardiansyah");
    System.out.println("Kelas : SIB-2E");
    System.out.println("NIM : 2141762145");
    System.out.println("===================================");
        int [] nim = {2,1,4,1,7,6,2,1,4,5};
        int jumlah = 0;
        
        for(int i = 0; i < nim.length; i++){
            jumlah+=nim[i];
        }
        System.out.println("Hasil dari penjumlahan total nim tersebut adalah = " + jumlah);
         
    }
}
