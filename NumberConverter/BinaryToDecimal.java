public class BinaryToDecimal {
    public static void main(String[] args) {
        int binNum = 101;
        int power = 0;
        int decNum = 0;

        while (binNum > 0) {
            int LastNum = binNum % 10;
            decNum = decNum + LastNum * (int) Math.pow(2, power);
            binNum = binNum / 10;
            power++;
            
        }
        System.out.print(decNum);
    }
}
