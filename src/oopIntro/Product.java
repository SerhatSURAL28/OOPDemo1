package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("ilk �al��acak constructure'd�r hangisini kullan�yorsan!");
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
