//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printdecreasing(int m){
        if (m==1){
            System.out.println(m);
            return;
        }
        System.out.print(m+" ");
        printdecreasing(m-1);
    }

    public static void printIncreasing(int n){
        if(n==10){                                          //isko karne ka ddusra bhi tareeka hai
            System.out.println(n);                          //n-1 se bhi kar sakte hai
            return;
        }
        System.out.println(n+" ");
        printIncreasing(n+1);
    }


    public static void printinc(int x ){
        if (x ==1){
            System.out.println(x);
            return;
        }
        printinc(x-1);
        System.out.print(x + " ");
    }
    public static void main(String[] args) {
        System.out.println("We are creating the recursion program ");
        int n= 0;
        int m=10;
        int x=10;
        printIncreasing(n);
        printdecreasing(m);
        printinc(x);
    }
}