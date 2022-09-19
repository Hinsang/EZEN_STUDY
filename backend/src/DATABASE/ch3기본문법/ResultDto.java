package DATABASE.ch3기본문법;

public class ResultDto {

	String mem_id;
	double value; // 집계함수 결과를 저장하는 필드
	
	public ResultDto() {}

	public ResultDto(String mem_id, double value) {
		super();
		this.mem_id = mem_id;
		this.value = value;
	}
	
}
