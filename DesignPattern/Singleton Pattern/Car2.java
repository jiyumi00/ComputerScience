import java.util.*;
import java.io.*;
public class Car2{
	//싱글톤 객체를 담을 변수
	private static Car2 instance;
	
	//getInstance()
	public static Car2 getInstance(){
		if(instance==null){
			instance=new Car2();
		}
		return instance;
	}
	//private 생성자
	private Car2(){
	
	}
	void powerOn(){
		System.out.println("전원을 켰습니다");
	}
	void stop(){
		System.out.println("멈췄습니다");
	}
}