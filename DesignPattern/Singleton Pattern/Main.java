import java.util.*;
import java.io.*;
public class Main{
	
    public static void main(String[] args) throws IOException{
		Car tesla1=new Car();
		Car tesla2=new Car();
		
		System.out.println(tesla1);
		System.out.println(tesla2);
		
		if(tesla1==tesla2){
			System.out.println("같은 인스턴스입니다");
		}else{
			System.out.println("다른 인스턴스입니다");
		}
    }
}