import java.util.Scanner;

/**
 * Created by MM on 9/27/2019.
 */
public class Main {
    public static void main(String[] args) {
     int n;
        Scanner input = new Scanner(System.in);
        System.out.print("tedade dars hara vared konid:");
        n= input.nextInt();
        float scores[]= new float[n];
        System.out.println("nomarat ra vared konid:");
        for(int i = 0; i < n; i++)
        {
            scores[i] = input.nextInt();

        }
        Ave a = new Ave(scores);
        System.out.println("miangin:"+a.average());


    }
}
