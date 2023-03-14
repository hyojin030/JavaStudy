package java0313;

import java.util.HashMap;

public class ExamHashMap {
	public static void main(String[] args) {
		//Collection에는 크게 2가지 부류의 타입
		// 1. Collection : 값만 저장
		//	1) 순서 지원 - list  2) 순서 미지원 - set
		// 2. Map : key와 value를 저장
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("홍", 90);
		scores.put("김", 80);
		scores.put("박", 85);
		System.out.println(scores);
		
		//검색
		System.out.println(scores.get("강")); //null
		System.out.println(scores.getOrDefault("강", 0)); //없으면 0을 반환

		//수정 : put(k,v)
		//삭제 :remove(k)
		System.out.println(scores.remove("홍")); //value를 반환
		
		
	} 
}
