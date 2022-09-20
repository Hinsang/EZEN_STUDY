package java1.ch5클래스.EX17_final;

public class Person {
	
	final String nation = "대한민국";
	final String ssn;
	String name;
	
	static final double EARTH_RADIUS = 6400;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
}
