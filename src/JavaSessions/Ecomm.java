package JavaSessions;

import java.util.ArrayList;

public class Ecomm {

	
	//WAF-->
	//create a function
	//input: produtName
	//output: List of sellers --- ArrayList<String>
	
	public ArrayList<String> getSellerList(String productName) {
		
		System.out.println("Seller List for the product : "+productName);
		
		ArrayList<String> sellerList = new ArrayList<String>();
		
		if(productName.equals("MacBook Pro")) {
			sellerList.add("Neon Enterprise");
			sellerList.add("IT Enterprise");
			sellerList.add("Lan Enterprise");
		}
		else if(productName.equals("T-Shirt")) {
			sellerList.add("Myntra Lts");
			sellerList.add("IT Co.Ent");
			sellerList.add("Ajio Ltd");
			
		}
		else if(productName.equals("x-box")) {
			sellerList.add("Myntra Ltd");
			sellerList.add("Ajio Ltd");
			
		}
		else {
			System.out.println(productName+" is not found!");
		}
		
		return sellerList;
	}
	
	
	public static void main(String[] args) {

		Ecomm obj = new Ecomm();
		ArrayList<String> xboxSellerList = obj.getSellerList("x-box");
		System.out.println(xboxSellerList);
		
		System.out.println("______________________________________________");
		
		ArrayList<String> macSellerList = obj.getSellerList("MacBook Pro");
		System.out.println(macSellerList);
		
		
		
	}

}
