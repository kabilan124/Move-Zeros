import java.util.Scanner;
public class MoveZeros {
    static void move(int arr[],int n)
    {
        int i=0;
        for (int val:arr)
        {
            if(val!=0)
            {
                arr[i]=val;
                i++;
            }
        }
        while (i<n)
        {
            arr[i]=0;
            i++;
        }
        for (int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        move(arr,n);
    }
}