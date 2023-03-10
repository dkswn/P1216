package hashset;
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	public boolean equals(Object obj) { 
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name)&&(member.age == age); // hashset의 객체 비교할때 equals로 비교한다
		} else {
			return false;
		}
	}
	public int hashCode() {
		return name.hashCode() + age;
	}
}
