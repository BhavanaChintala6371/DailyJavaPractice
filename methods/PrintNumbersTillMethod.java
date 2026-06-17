package methods;

public class PrintNumbersTillMethod {
    public static void printNumbersTill(int number){
        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        printNumbersTill(20);
    }
}
