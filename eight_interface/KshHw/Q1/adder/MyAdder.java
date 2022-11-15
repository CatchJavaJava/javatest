package adder;

import add.*;


public class MyAdder implements AdderInterface{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int add(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++)
			sum+=i;
		return sum;
	}
	/* 재귀함수 표현, 함수를 계속해서 불러들이는 과정에서 스택 메모리를 많이 잡아먹어 성능 저하의 위험성 존재
	public int add(int n){
		if(n==1)
			return 1;
		return n+add(n-1);
	*/
}
