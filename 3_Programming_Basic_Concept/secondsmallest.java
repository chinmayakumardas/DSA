import java.util.*;
public class secondsmallest 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the array");
int arr[] = new int[5];
for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
}
for (int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
    }
}
System.out.println("2nd smallest value is"+ arr[1]);
}
}