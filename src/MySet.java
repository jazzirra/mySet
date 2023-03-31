import java.util.Arrays;

public class MySet {
    private int[] massiav;

    public MySet(int[] massiav) {
        int chetFor =0;
        int chet1=0;
        for (int i = 0; i < massiav.length; i++) {
            for (int j = i+1; j < massiav.length; j++) {
                if (massiav[i]==massiav[j]){
                 chetFor=j;
                    chet1++;
                }
            }
        }
        if (chet1== 0){
            this.massiav = massiav;
            System.out.println("no similar items"+Arrays.toString(massiav));
            this.massiav = massiav;
        }else {
            System.out.println("there are similar items"+Arrays.toString(massiav)+chet1+chetFor);

        }
    }

    public int[] getMassiav() {
        return massiav;
    }

    public void setMassiav(int[] massiav) {
        this.massiav = massiav;
    }

    @Override
    public String toString() {
        return "MySet{" +
                "massiav=" + Arrays.toString(massiav) +
                '}';
    }
}