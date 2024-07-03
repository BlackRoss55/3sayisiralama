import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a = sc.nextInt();
        System.out.print("b sayısını giriniz: ");
        b= sc.nextInt();;
        System.out.print("c sayısını giriniz: ");
        c = sc.nextInt();

        if((a<b)&&(a<c)){
            if(b<c){
                System.out.print("a<b<c");
            }
            else{
                System.out.print("a<c<b");
            }
        }
        else if((b<a)&&(b<c)){
            if(a<c){
                System.out.print("b<a<c");
            }
            else{
                System.out.print("b<c<a");
            }
        }
        else if((c<a)&&(c<b)){
            if(a<b){
                System.out.print("c<a<b");
            }
            else{
                System.out.print("c<b<a");
            }
        }
    }
}