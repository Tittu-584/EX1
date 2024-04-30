import java.util.*;
class Array{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter length of the array: ");
int n=s.nextInt();
System.out.println("Enter the elements: ");
int a[]=new int[n];
int sum=0;
for(int i=0;i<n;i++){
a[i]=s.nextInt();
sum+=a[i];
}
System.out.println("Sum of elements is: "+sum);
Arrays.sort(a);
System.out.println("Minimum element is : "+a[0]);
System.out.println("Maximum element is : "+a[n-1]);
}
}