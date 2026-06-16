package methods;

public class PrintOddNumbersMethod {
    public static void printOddNumbers(){
        for( int i=1; i<=10;i+=2){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        printOddNumbers();
    }
}
