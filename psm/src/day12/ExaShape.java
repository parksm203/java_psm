package day12;

public class ExaShape {
	//도형 클래스 : 그림판에서 그려지는 모든 도형을 대표할 수 있는 클래스
	//
   /* 도형은 사각형안에 그릴수있고, 그 사각형은 왼쪽위의 점과 오른쪽아래 점을 표현할 수 있다.
	* 도형은 위치를 이동시킬수 있다.(크기는 변하지 않음)
	* 도형은 크기를 변화시킬 수 있다.(방향은 마음대로)
	* */
	//왼쪽위의점, 오른쪽아래점
	protected int left, top;		//왼쪽 위점
	protected void name() {
		
	} int right, bottom;	//오른쪽 아래점
	//도형을 그릴 때 대각선점 2개가 필요
	public ExaShape(int x1, int y1, int x2, int y2) {
		left = x1 < x2 ? x1 : x2;
		right = x1 > x2 ? x2 : x1;
		top = y1 < y2 ? y1 : y2;
		bottom = y1 > y2 ? y2 : y1;
		/*
		if(x1<x2) {
			left = x1;
			right = x2;
		}else {
			left = x2;
			right = x1;
		}
		if(y1<y2) {
			top = y2;
			bottom = y1;
		}else {
			top = y2;
			bottom = y1;
		}
		*/
	}
	//도형의 너비를 계산하는 기능
	public int getWidth() {
		return right - left;
	}
	
	//도형의 높이를 계싼하는 기능
	public int getHeight() {
		return bottom - top;
	}
	
	
	//도형을 이동  시킬 수 있다.(왼쪽 위의 점)
	public void move(int left, int top) {
		this.right = left + getWidth();
		this.bottom = top + getHeight();
		this.left = left;
		this.top = top;
		
	}
	//도형은 크기를 바꿀 수 있다.(방향은 마음대로)
	/*direction : 1이면 우하방향, 2이면 좌하 방향, 3이면 좌상방향, 4이면 우상방향*/
	public void resize(int width, int height, int direction) {
		if(width <= 0 || height <= 0) {
			System.out.println("잘못된 너비 또는 높이입니다.");
			return ;
		}
		switch(direction)	{
		case 1:
			right = left + width;
			bottom = top + height;
			break;
		case 2:
			left = right - width;
			bottom = top + height;
			break;
		case 3:
			left = right - width;
			top = bottom - height;
			break;
		case 4:
			right = left + width;
			top = bottom - height;
			break;
		default:
			System.out.println("잘못된 방향입니다.");
		}
			
	}
	//도형 그리기
	public void print() {
		System.out.println("---도형---");
		System.out.println("좌상점 : "+ left + "," + top);
		System.out.println("우하점 : " + right + "," + bottom);
	}
	
}

	
	
	
	
	
	
	
	
	
	/*int x,y;
	private int left,top,right,bottom;
	public ExaShape(int x, int y, int left, int top, int right, int bottom) {
		super();
		this.x = x;
		this.y = y;
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}
	public void print() {
		System.out.println();
		
	}
	*/
	
	
	
	

