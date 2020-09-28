package Day9;

import java.util.Scanner;

interface StudentFee{
	void getFee();
}
class InvalidFeeException extends Exception{
	
}
class Student implements StudentFee{

	@Override
	public void getFee() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee :");
		double fee=sc.nextDouble();
		try {
			if(fee < 5000)
			{
			throw new InvalidFeeException();
			}else {
				System.out.println("Fee : "+fee);
			}
		}catch(InvalidFeeException e) {
			System.out.println(e);
		}
	}
	
}
public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.getFee();
	}

}
