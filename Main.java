import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
      if(arr[i]==1)
        count++;
    }
    System.out.println("Count of 1's in given array is "+count);
  }
}