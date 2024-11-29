public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int primeCounter = 0;
        boolean[] isPrime = new boolean[n - 1];
        for(int i = 0; i < n - 1; i++) {
            isPrime[i] = true;
        }
        double max = Math.sqrt(n);
        for(int i = 2; i <= max; i++) {
            if(isPrime[i - 2]) {
                for(int j = 2 * i; j <= n; j+= i) {
                    isPrime[j-2] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for(int i = 0; i < n - 1; i++){
            if(isPrime[i]) {
                System.out.println(i + 2);
                primeCounter++;
            }
        }
        int primeRate = (int) (100 * primeCounter / n);
        System.out.println("There are " + primeCounter + " primes between 2 and " + n + " (" + primeRate + "% are primes)");
    }
}