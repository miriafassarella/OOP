package exercicesPOO.encapsulation.javabeans;

import java.io.Serializable;

public class Supplier implements Serializable{
	
	private String name;
	
	public Supplier(){
		
	}
	public Supplier(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
