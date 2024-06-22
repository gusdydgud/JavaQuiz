package quiz18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz02 {
	
	public static void main(String[] args) {
		/*
		롤 큐 만들기
		 */
		String[] tiers = {"브론즈", "실버", "골딱이"};
		Random random = new Random();

		Queue<Member> member = new LinkedList<>();
		for (int i = 0; i < 300; i++) {
			int id = member.hashCode(); // ID는 고유한 해시코드값
			
			String tier = tiers[random.nextInt(tiers.length)];
			member.add(new Member(id, tier));
		}
		
		
		Queue<Member> gold = new LinkedList<>();
		Queue<Member> silver = new LinkedList<>();
		Queue<Member> bronze = new LinkedList<>();
		int c = 1;
		int match =1;
		System.out.println("========현재 게임을 신청한 순서=======");
		System.out.println(member);
		while(member.isEmpty()==false) {
			String t = member.peek().getTier();
			
			if(t.equals("브론즈")) {
				bronze.add(member.poll());
			}else if(t.equals("실버")) {
				silver.add(member.poll());
			}else {
				gold.add(member.poll());
			}
			if(gold.size()==5) {
				System.out.print(c+"번팀" +" 골드큐: ");
				while(gold.isEmpty()==false) {
					System.out.print(gold.poll());
				}System.out.println();
				c++;
			}else if(silver.size()==5) {
				System.out.print(c+"번팀 실버큐: ");
				while(silver.isEmpty()==false) {
					System.out.print(silver.poll());
				}System.out.println();
				c++;
			}else if(bronze.size()==5) {
				System.out.print(c+"번팀 브론즈큐: ");
				while(bronze.isEmpty()==false) {
					System.out.print(bronze.poll());
				}System.out.println();
				c++;
			}
		}
		while(gold.isEmpty()==false) {
			
			System.out.print(gold.poll());
		}
		while(silver.isEmpty()==false) {
			
			System.out.print(silver.poll());
		}
		while( bronze.isEmpty() == false) {
			System.out.print(bronze.poll());
			
		}
			
		
		///////////////////////////////////////////////////////////
		/////////////////////////여기서 부터 문제/////////////////////
		/*
		 * member큐에는 게임을 신청한 순서대로 값이 담기게 됩니다.
		 * 
		 * 게임은 동일한 tier를 가지는 5명씩 한팀을 이루게 됩니다.
		 * 
		 * 예를들어
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드 ... 로 신청되었다면
		 * 골드 5명이 먼저 한팀으로 먼저 소비 되어야 합니다.
		 * 
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드, 실버, 실버, 브론즈, 실버, 실버 ... 로 신청되었다면
		 * 골드 5명 -> 실버 5명이 소비 되어야 합니다
		 * 
		 * 
		 * 랜덤한 member큐 가 주어질 때, 먼저 소비되어야 하는 팀별로 매칭 팀을 출력해주면 됩니다.
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}
	public static void matching(int match, Queue<Member> m) {
		System.out.println(match+"번째 팀");
		while(m.isEmpty()==false) {
			System.out.println(m.poll());
		}
		match++;
	}

}
