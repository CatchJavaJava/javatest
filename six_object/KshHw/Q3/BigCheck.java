public class BigCheck {
	public BigCheck() 
	{}
	
	public int bigCheck(int x, int y)
	{
		return (x>y?x:y);						//x>y?x:y, x가 y보다 더 클 경우 x를 리턴, 아닐 경우 y를 리턴, 논리연산자를 이용한 축약 표현
	}
}
