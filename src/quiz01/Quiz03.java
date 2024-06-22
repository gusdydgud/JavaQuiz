package quiz01;

public class Quiz03 {

	public static void main(String[] args) {
		
		/*
		 *  130/10 13
		 */
		int bucket = 10;
		int apple = (int)(Math.random() * 150) +1; // 사과의 개수
		// 사과의 개수가 정해질때, 3항 연산식을 이용해서 필요한 바구니의 개수를 구하세요
		System.out.println("사과의 개수는: "+apple);
		
		
		//System.out.println(apple / bucket> 0 ?"바구니 개수는: "+ (apple/bucket+1) :"바구니 개수는:"+ 1  );
		System.out.println(apple%bucket > 0 ? "바구니 개수는: " + ((apple/bucket)+1) : "바구니 개수는: " + (apple/bucket));
		//System.out.println((apple / bucket)% 10 > 1  ?"바구니 개수는: "+ (apple/bucket+1) :"바구니 개수는:"+ (apple/bucket) );
		// TODO Auto-generated method stub
		

	}

}

