package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    //i tadinya 0 ditambahkan 1 sekarang menjadi i = 2;
        System.out.println(i);  //betulkan i nilainya 1
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang di tambahkan lahi 1 menjadi 2
        System.out.println(i);  //tuh betul kan i nilainya 2
        i++;                    //bisa di lihat i++ sama dengan i = i+1
        System.out.println(i);  //i tadinya 2 sekarang jadi 3

        //berlaku juga untuk penambahan angka lain dan operator aritmatika lain
        i+=3;   //sama dengan i = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3;   //sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);
    }
}
