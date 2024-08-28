import java.util.*;
public class Sample{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        switch(a){
            case 1:{
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            case 7:{
                System.out.println("Saturday");
                break;
            }
            default:
            System.out.println("Invalid day");
        }
        for(int i=0;i<=a;i++){
            System.out.println(i);
        }
        while(a!=0){
            System.out.println(a);
            a--;
        }
        int start=1;
        do{
            System.out.print(start);
            start++;
        }while(start<=3);
    }
}