

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);

    }
    public static void printUntilNumber(int number){
        int sayac =1;
        while(true){            
            if(sayac>number){
                break;
            }
            if(sayac <= number){
                System.out.println(sayac);
                sayac++;
            }
            
        }
    }

}
