// punto 7
public class punto_07 {
    public static void main(String[] args) {
        
        int galones = 10;
        double conversion = 0;
        
        do {
            conversion = galones * 3.785;
            System.out.println( galones + " galones son " + conversion + " litros");
            galones ++;
        } while (galones <= 20);
    }
}
