public class Primes {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[size+1];
      

        //  but set everything to true except 0,1,2 
        for(int i =2 ; i< arr.length; i++){
            arr[i] = true;
        }

        int i=2;
        int j;



        while(i<arr.length){
            if(arr[i]==true){
                j=2*i;
                while(j<arr.length){
                    arr[j]= false;
                    j+=i;
                }
            }
            i++;
        }

        System.out.println("Prime numbers up to " + size +":");

        int prime_count =0;

        for(i=0 ; i<arr.length ; i++)
            if(arr[i] == true){
                System.out.println(i);
                prime_count++;

        }
        double precent =100* ((double)prime_count/(double)(size));
        System.out.println("There are "+prime_count +" primes between 2 and "+ size + " (" + (int)precent + "%" + " are primes)");



        // Replace this statement with your code
    }
}