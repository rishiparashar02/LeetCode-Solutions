class MyHashSet {
    List<Integer> arr[];
    int n = 100000;
    public MyHashSet() {
        arr = new ArrayList[n];
        for(int i =0; i<arr.length ; i++){
            arr[i] = new ArrayList<>();
        }
    }
    
    public void add(int key) {
        int index = key%n;
        if(!arr[index].contains(key)){
            arr[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = key%n;
        arr[index].remove(Integer.valueOf(key));
        
    }
    
    public boolean contains(int key) {
        int index = key % n;
        return arr[index].contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */