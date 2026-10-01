class MyQueue {

    private List<Integer> in;
    private List<Integer> out;

    public MyQueue() {
        in = new ArrayList<>();
        out = new ArrayList<>();
    }

    public void push(int x) {
        in.add(x);
    }

    public int pop() {
        transfer();
        return out.remove(out.size() - 1);
    }

    public int peek() {
        transfer();
        return out.get(out.size() - 1);
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void transfer() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.add(in.remove(in.size() - 1));
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */