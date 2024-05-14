import java.util.*;
import java.io.*;
public class Main2{
	
    public static void main(String[] args) throws IOException{
		Car2 tesla1=Car2.getInstance();
		Car2 tesla2=Car2.getInstance();
		
		System.out.println(tesla1);
		System.out.println(tesla2);
		
		if(tesla1==tesla2){
			System.out.println("같은 인스턴스입니다");
		}else{
			System.out.println("다른 인스턴스입니다");
		}
    }
}