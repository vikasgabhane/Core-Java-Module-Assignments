package Day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable{
	
	private String itemName;
	private double price;
	private int quantity;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
public class Q66_InsertIntoBinaryFile {

	public static void main(String[] args) {
		Product p = new Product();

		p.setItemName("java");
		p.setPrice(568.25);
		p.setQuantity(3);
		System.out.println(p);
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\CDAC LAB\\JAVA\\Java\\src\\Day10\\shopping.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// write object to file
			oos.writeObject(p);
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
