// Program 1: Advanced Interview Style Program
// Topic: Menu Driven Array Operations
// This program demonstrates:
// 1.Input
//2. sorting
// 3. searching
// 4. Reverse
// 5. sum and average
// 6. max and min
//7. Display
// 8.count Even/Odd
// 9. Copy Array
// 10. Exit
import java.util.*;
class Program1 {
    static int arr[] = new int[10];
    static int n = 10;

    static void input() {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++ {
            arr[i] = sc.nextInt();
        }
    }


    static void display() {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[i]+" ");
    }
    System.out.print(arr[i]+" ");
}
System.out.println();

}
static void sort() {
    for(int i=0;i<n;i++) {
        for(int j=0;j<n-1;j++) {
            if(arr[j]>arr[j+1]) {
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
    }
}
static void reverse() {
    int i=0,j=n-1;
    while(i<j) {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        i++; j--;
    }
}
static void sumAvg() {
    int sum=0;
    for(int i=0;i<n;i++) {
        sum+=arr[i];
    }
    double avg=sum/n;
    System.out.println("Sum="+sum);
    System.out.println("Avg="+avg);
}

static void maxMin() {
    int max=arr[0].min=arr[0];
    for(int i=0;i<n;i++) {
        if(arr[i]>max) max=arr[i];
        if(arr[i]<min) min=arr[i];
    }
    System.out.println("Max="+max);
    System.out.println("Min="+min);
}
static void countEvenOdd() {
    int e=0.o=0;
    for(int i=0;i<n;i++) {
        if(arr[i]%2==0) e++;
        else o++;
    }
    System.out.println("Even="+e);
    System.out.println("Odd="+o);
}
static void copyArr() {
    int b[]=new int[n];
    for(int i=0;i<n;i++) {
        b[i]=arr[i];
    }
    System.out.println("Copied Array:");
    for(int i=0;i<n;i++) {
        System.out.print(b[i]+" ");
    }
    System.out.print(b[[i]+" ");
}
System.out.println();
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ch;
    do{
        System.out.println("1.Input");
        System.out.println("2.Display");
        System.out.println("3.Sort");
        System.out.println("4.Reverse");
        System.out.println("5.Sum Avg");
        System.out.println("6.Max Min");
        System.out.println("7.Count Even Odd");
        System.out.println("8.Copy");
        System.out.println("9.Exit");
        ch = sc.nextInt();
        switch(ch) {
            case 1: input() ; break;
            case 2: display() ; break;
            case 3: sort() ; break;
            case 4: reverse() ; break;
            case 5: sumAvg() ; break;
            case 6: maxMin() ; break;
            case 7: countEvenOdd() ; break;
            case 8: copyArr() ; break;
            case 9: System.out.println("Exit") ; break;
        }
    } while(ch!=9);
  }
}
