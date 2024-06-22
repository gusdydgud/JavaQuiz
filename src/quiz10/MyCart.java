package quiz10;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	int money;
	Product[] cart = new Product[1]; //상품을 저장할 배열
	int i = 0;
	private Computer com;
	private Radio ra;
	private Tv tv;
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}

	
	/* 
	 * 3. buy(모든 상품을 받도록 선언)
	 * 접근제어자 퍼블릭
	 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고
	 * add(상품)을 호출해 줍니다.
     */ 	
	
	public void buy(Product p) {
		
		int sum = 0;
		sum = sum + p.price;
		if(money>=sum) {
			money -=sum;
			add(p);
		}else {
			System.out.println("금액부족");
			return;
		}
		
		
	}
	/* 
	 * 4. add(모든 상품을 받도록 선언)
	 * 접근제어자 프라이빗
	 *
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 */

	private void add(Product name) {
		
		i++;
		
		if(i>=cart.length) {
			Product[] cart2 = new Product[cart.length*2];
			cart2 = cart;
			cart = cart2;
			cart[i-1] = name;
			
			
			
		}else {
			cart[i-1] = name;
		}
	}
	/*
	 * 5.info()
	 * 
	 * instanceof 를 적용해보면 좋을것 같아요
	 *
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	public void myCartInfo() {
		for(int j=0; j<i;j++) {
			System.out.print(cart[j].name+" ");
			
		}
		int sum =0;
		for(int j=0;j<i;j++) {
			sum+=cart[j].price;
		}
		System.out.println("총가격: "+sum+"잔돈: "+(money-sum));
	}
	
	
	
	
	
	
	
	
	
	
}
