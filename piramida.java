public class piramida {
    public static void main(String[] args) {
    System.out.println("Nama : Rizqi Hendra Ardiansyah");
    System.out.println("Kelas : SIB-2E");
    System.out.println("NIM : 2141762145");
    System.out.println("===================================");
    int nim[] = {2,1,4,1,7,6,2,1,4,5};
    int idx = 0;
    int i = 0;
    do{
        int j = i;
        do{
            System.out.print(" ");
            j++;
        }while(j<nim.length);
        int k=0;
        do{
            System.out.print(nim[idx]+" ");
            idx++;
            k++;
        }while(k<=i);
        System.out.println();
        i++;
    }while(i<4);
    }
}