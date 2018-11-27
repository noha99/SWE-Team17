package Team17;

public class LargestPrime {
	int largest_prime;
	LargestPrime(int []arr) {
		largest_prime=-1;
		for(int i=0;i<arr.length;i++) {
			boolean isPrime=true;
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime && arr[i]>largest_prime) {
				largest_prime=arr[i];
			}
		}
		//return largest_prime;
	}
}
