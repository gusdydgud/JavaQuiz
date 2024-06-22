package quiz11;

public class MyArrays {
	
	/*
	 * Arrays.toString() 메서드 내가만들기
	 * 1. MyArrays는 외부에서 객체로 생성할 수 없어야함
	 * 	-> 생성자에 접근제어자를 이용해서 객체생성을 하지못하도록.
	 * 
	 * 2. 메서드호출시에는 static키워드를 이용해서 사용하도록 만들어준다.
	 * 
	 * 3. int[], 이나 String[] 이나 char[] 이 전달되더라도 동일하게 동작하도록
	 * 	  메서드 오버로딩.
	 */
//	private MyArrays arr[] = new ;
	private MyArrays() {
		
	}
	public static String toString(int arr[]) {
		String result = "[";
		for(int i =0 ; i<arr.length;i++) {
			result += arr[i];
			if(i < arr.length-1) {
				result += ", ";
				
			}
		}
		return result+"]";
	}
	public static String toString(String arr[]) {
		String result = "[";
		for(int i =0 ; i<arr.length;i++) {
			result += arr[i];
			if(i < arr.length-1) {
				result += ", ";
				
			}
		}
		return result+"]";
	}
	public static String toString(char arr[]) {
		String result = "[";
		for(int i =0 ; i<arr.length;i++) {
			result += arr[i];
			if(i < arr.length-1) {
				result += ", ";
				
			}
		}
		return result+"]";
	}
	
	
	
	

}
