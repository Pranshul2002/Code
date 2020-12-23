import java.lang.Math;
import java.util.*;
class QuadraticRootFinder{
    static double[] find(int a,int b,int c){
        double arr[] = {0,0}; 
        double d = b*b - 4*a*c;
        switch(( d > 0)?1:0){
            case 0:
                switch((d < 0)?1:0){
                    case 1:
                        arr[0] = -1000;
                        arr[1] = -1000;
                    
                    break;
                    default:
                    arr[0] =  -b / 2*a;
                    arr[1] = -b/2*a;
                   
                }
            break;
            default:
                arr[0] = (-b + Math.sqrt(d)) / (2 * a);
                arr[1] = (-b - Math.sqrt(d)) / (2 * a);
            
                
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b ");
        int b = sc.nextInt();
        System.out.println("Enter c ");
        int c = sc.nextInt();
        double [] roots = find(a,b,c);
        System.out.println("Roots are: " + roots[0] + " and " + roots[1]);
    }
}