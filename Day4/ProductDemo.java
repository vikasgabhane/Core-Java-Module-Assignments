import java.util.*;

class Product{
    int pid;
    double price;
    int qty;
    
    public Product(){
         this.pid = 0;
        this.price = 0;
        this.qty = 0;
    }
    
    public Product(int pid, double price, int qty){
        this.pid = pid;
        this.price = price;
        this.qty = qty;
    }
    
    public void display(){
        System.out.println("Pid : "+this.pid+", Price : "+this.price+", Quantity : "+this.qty);
    }
    
    public static double calAmount(Product []arr){
        double totalAmount=0;
        for(int i =0; i<arr.length; i++){
            double productAmt = arr[i].price * arr[i].qty;
            totalAmount += productAmt;
        }
        return totalAmount;
    }
}

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product arr[] = new Product[5];
	    
	    for(int i =0; i<5 ; i++){
	        System.out.println("Enter pid, price and quantity for the Product : ");
	        int id = sc.nextInt();
	        double price = sc.nextDouble();
	        int q = sc.nextInt();
	        
	        Product item = new Product(id, price, q);
	        arr[i] = item;
	    }
	    double max = 0;
	    int id=arr[0].pid;
	    int qty=arr[0].qty;
	    for(int i=0; i<5; i++){
	        if(max < arr[i].price){
                max = arr[i].price;
                id = arr[i].pid;
                qty=arr[i].qty;
	        }
	    }
	    
	    System.out.println("Highest price Product :\n Pid : "+id+", Price : "+max+", quantity : "+qty);
	    System.out.println("Total Amount Spent : "+Product.calAmount(arr));
	}
}
