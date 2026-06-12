//question705
public class hashhset {
    private boolean[] set;
    public hashhset() {
        set = new boolean[1000001];
    }
    public void add(int key) {
        set[key] = true;
    }
    public void remove(int key) {
        set[key] = false;
    }
    public boolean contains(int key) {
        return set[key];
    }
    public static void main(String[] args) {
        hashhset obj = new hashhset();
        obj.add(1);
        obj.add(2);
        System.out.println(obj.contains(1)); // true
        System.out.println(obj.contains(3)); // false
        obj.add(2);
        System.out.println(obj.contains(2)); // true
        obj.remove(2);
        System.out.println(obj.contains(2)); // false
    }
}