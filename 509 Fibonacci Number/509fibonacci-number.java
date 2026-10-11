class Solution {
    private final List<Integer> fib = new ArrayList<>(List.of(0, 1));
    public int fib(int n) {
        if(n<fib.size()){return fib.get(n);}
        fib.add(fib(n-1)+fib(n-2));
        return fib.get(n);
    }
}