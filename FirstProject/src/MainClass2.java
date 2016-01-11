/*
 * class A{}
 * class B{}
 * public class C{} => C.java
 * 
 * class A{}
 * class B{}
 * class C{main()} => main.java
 */
// 2진법 출력하는 코딩
import java.util.Scanner;
public class MainClass2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0~32767사이의 정수 입력 : ");
		int num=scan.nextInt();
		int num2=num;
		int[] arr=new int[16];
		int index=15;
		while(true){
			arr[index]=num%2;
			num=num/2;
			if(num==0)
			break;
			index--;
		}
		//출력
		for(int i=0; i<arr.length; i++){
			if(i%4==0 && i!=0){
				System.out.print(" ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(Integer.toBinaryString(num2));

	}

}
