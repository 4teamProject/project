/*
 * 배열 : 같은 데이터형을 모아서 관리
 *        ============
 * 		  연속적인 메모리 구조를 가지고있음
 * 형식) 1. 데이터 -> 배열
 * 			1)데이터형[] 배열명; ==> 권장사항
 * 			  데이터형 배열명[];
 * 		    2)초기값 설정
 * 			  1. new를 이용하는 방법 -> 0으로 초기화 
 *               (정수형 : 0(long:0L) / 실수형 : 0.0(float:0.0F / 
 *                문자형 : \0 / 문자열 : null)
 *            2. 데이터형[]배열명 ={1,2,3,4,5};
 *            
 *            ex) int [] arr; => arr이라는 4바이트
 *                   ====
 *                   
 *                   ====
 *                   arr = new int[5]
 *                   =================================
 *                     0|   0 |    0 |    0 |    0   
 *                   =================================
 *                arr arr+1  arr+2 arr+3 arr+4
 *                arr=100
 *                arr+1=104
 *                arr+2=108
 * 		 2. 명령문 -> 메소드
 * 		 3. 데이터 + 명령문 -> 클래스
 * 
 * 		 
 * 		 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[5];
		for(int i=0; i<arr.length ; i++){
			arr[i]=(int)(Math.random()*100)+1;
		}
		//처리(최대값,최소값)
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		
		//출력
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
