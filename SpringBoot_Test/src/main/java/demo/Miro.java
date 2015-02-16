package demo;

import java.util.Stack;

/**
 * 미로찾기
 * 시작점에서 갈수 있는 경로는 스택에 쌓고
 * 스택에서 하나를 꺼내서 목직지인지 보고 
 * 갈수 있는 경로로를 또 쌓고
 * @author kimunseok
 *
 */
public class Miro {

	
	/**
	 * 트레이스 저장소
	 */
	Stack<Point> stack = new Stack<Miro.Point>();
	
	boolean[][] isMark = new boolean[5][5];
	
	int[][] miroMap = { 
			{1,1,1,1,1},
			{1,1,1,1,1},
			{1,1,1,1,1},
			{1,1,1,1,9},
			{1,1,1,1,1},
			
	};
	
	/**
	 * 발걸음을 쌓자
	 * @param p
	 */
	public void logPut(Point p){
		
		if( validPoint(p) ){
			isMark[p.x][p.y] = true;
			stack.push(p);
		}
		
	}
	/**
	 * 발걸음중 하나를 꺼내자
	 * @return
	 */
	public Point logOut(){
		
		if( stack.size()>0 ){
			Point result = stack.pop();
			return result;
		}else{
			return null;
		}
		
	}
	
	/**
	 * 찾아보자
	 * @return
	 */
	public boolean start(){
		
		int n_x=0;
		int n_y=0;
		
		Point point = new Point(n_x, n_y);
		
		
		while( miroMap[point.x][point.y] != 9 ){
			
			logPut( point.left() );
			logPut( point.right() );
			logPut( point.up() );
			logPut( point.down() );
			
			System.out.println("stack.size() : " + stack.size());
			System.out.println( point.toString() );
			
			point = logOut();
			
			if( point == null ){
				return false;
			}
			
			
		}//end while
		
		System.out.println( "point_x : " + point.x + " point y : " + point.y );
		
		//X 발견될때 까지
		
		
		return true;	
	}
	
	/**
	 * 유효한 포인트 인지
	 * @param p
	 * @return
	 */
	private boolean validPoint(Point p ){
		
		
		
		int x_max = miroMap.length;
		int y_max = miroMap.length;
		
		int x = p.x;
		int y = p.y;
		
		return ( x_max>x && y_max>y && x>=0 && y>=0 && !isMark[x][y] );
		
		
	}
	
	/*
	
	*/
	
	
	
	
	/**
	 * 좌표 클래스
	 * @author kimunseok
	 *
	 */
	private class Point{
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
			
			
		}
		private Point left(){
			return new Point(this.x-1, this.y);
		}
		private Point right(){
			return new Point(this.x+1, this.y);
		}
		private Point up(){
			return new Point(this.x, this.y+1);
		}
		private Point down(){
			return new Point(this.x, this.y-1);
		}
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
		
		
	}
	
}
