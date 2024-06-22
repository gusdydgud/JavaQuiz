package quiz18;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueQuiz01 {
	
	public static void main(String[] args) {
		
		Queue<Customer> que = new PriorityQueue<>();
		
		Customer arr[] = {
				new Customer("hong",5),
				new Customer("lee",4),
				new Customer("john",1),
				new Customer("홍길동씨",6),
				new Customer("alen",2)
		};
		List<Customer> customer = Arrays.asList(arr);
		que.addAll(Arrays.asList(arr));
		//은행에 번효표를 뽑아서 가지고 있는 Customer배열입니다.
		//번호표 순대로, 객체를 출력.
//		for(int i =0 ;i<arr.length;i++) {
//			que.offer(arr[i]);
//		}
		while(que.isEmpty() == false) {
			System.out.println(que.poll());
		}
		
		
		
	}

}
