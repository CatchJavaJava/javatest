public class Upper {
	private String lower;						//소문자를 포함한 문자열
	
	
	public Upper()								//디폴트 생성자
	{}
	
	public void setLower(String lower)			//설정자 : 필드의 값을 지정하는 메소드
	{
		this.lower = lower;
	}
	
	public String changeToUpper()				//소문자를 대문자로 바꾸는 메소드
	{
		return lower.toUpperCase();				//String 타입 고유 메소드, 소문자를 대문자로 바꿔주는 기능을 가짐
	}
}
