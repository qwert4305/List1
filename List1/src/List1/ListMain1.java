package List1;

import java.util.ArrayList;
import java.util.List;

public class ListMain1 {

	public static void main(String[] args) {

		// 2021_06_15
		// 1. List 의 index 에 순차적으로 중복, 중복, 안중복 value 담기
		// 2. for 문으로 index, value 확인
		// 3. List 의 값(value)으로 index 조회
		// 4. for 문 돌리면서 index 에 값 함께 담아질 때 이전에 담은 값과 중복인지 검사

		// 1.
		List<String> words = new ArrayList<String>();
		words.add("중복");
		words.add("중복");
		words.add("안중복");

		// 2.
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			System.out.println("index:" + i + "value:" + word);
		}

		// 3. 
		// 만약 중복 value 일 땐 중복된 index 검색 할 수 있는 방법이 뭐가 있을까?
		int a = words.indexOf("중복");
		System.out.println(a);
		
		// 4. 
		for (int i=0; i<words.size(); i++) {
			String before = words.get(i);
			System.out.println(before);
			for (int j=0; j<i; j++) {
			System.out.println(j);
			}
		}

	}

}
