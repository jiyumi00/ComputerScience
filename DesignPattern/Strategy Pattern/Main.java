import java.util.*;
import java.io.*;
public class Main{
	
    public static void main(String[] args) throws IOException{
		ShoppingCart cart=new ShoppingCart();
		
		Item itemA=new Item("keyboard",70000);
		Item itemB=new Item("mouse",20000);
		
		cart.addItem(itemA);
		cart.addItem(itemB);
		
		// pay by LUNACard
		cart.pay(new LUNACardStategy("kundol@example.com","1234"));
		
		// pay by KAKAOCard
		cart.pay(new KAKAOCardStrategy("kundol","123456789","123","12/01"));
		
    }
}