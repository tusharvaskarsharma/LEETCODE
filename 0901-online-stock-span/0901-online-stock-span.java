class StockSpanner {
    private List<Integer> pricesList;
    private Stack<Integer> s;

    public StockSpanner() {
        pricesList = new ArrayList<>();
        s = new Stack<>();
    }

    public int next(int currentPrice) {
        pricesList.add(currentPrice);
        int i = pricesList.size() - 1;
        
        while (!s.isEmpty() && pricesList.get(s.peek()) <= currentPrice) {
            s.pop();
        }
        
        int ans;
        if (s.isEmpty()) ans = i + 1; 
        else ans = i - s.peek();
        
        s.push(i);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */