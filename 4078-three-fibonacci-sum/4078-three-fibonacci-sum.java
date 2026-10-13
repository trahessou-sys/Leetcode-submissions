class Solution {
    List<Integer> fib =new ArrayList<>(Arrays.asList(0,1));
    public Integer Fib(int n){
        if(n<fib.size()){return fib.get(n);}
        fib.add(Fib(n-1)+Fib(n-2));
        return fib.get(n);
    }

    public boolean threeFibonacciSum(int n){
        if(n%2!=0){return false;}
        int i=0;
        while(Fib(i)<n/2){
            i++;
        }
        return Fib(i)==n/2;
    }
}