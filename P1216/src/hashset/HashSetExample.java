package hashset;
import java.util.HashSet;
import java.util.Set;
public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); // Set에선 중복일 경우 하나의 객체만 출력됨
		
		System.out.println("총 객체 수 ::" + set.size());

	}

}
