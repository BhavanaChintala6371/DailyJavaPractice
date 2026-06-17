package methods;

public class PrintTableWithParameter {
    public static void printTable(int number){
        for(int i=1;i<=number;i++){
            System.out.println(number+"x"+i+"="+(number * i));
        }
    }
    public static void main(String[] args){
        printTable(10);
    }
}
