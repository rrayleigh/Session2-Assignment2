package training;

public class PrimeNumbers {
	public static void main(String[] args){
		System.out.println("Following are the prime numbers");
		for(int i=1;i<100;i++){
			if(i==1){
				continue;
			}
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
				
			}
			if(isPrime==true){
				
				System.out.print(i+" ,");
			}
		}
	}
}
