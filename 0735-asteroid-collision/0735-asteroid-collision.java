class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> liste= new ArrayList<>();
        for (int b : asteroids) {
            boolean alive = true;
            while (alive && b < 0 && !liste.isEmpty() && liste.get(liste.size() - 1) > 0) {
                int a = liste.get(liste.size() - 1);
                if (Math.abs(a) < Math.abs(b)) {
                    liste.remove(liste.size() - 1); 
                } else if (Math.abs(a) == Math.abs(b)) {
                    liste.remove(liste.size() - 1); 
                    alive = false;
                } else {
                    alive = false; 
                }
            }
            if (alive) liste.add(b);
        }
        int[] arr = new int[liste.size()];
        for (int i = 0; i < liste.size(); i++) {
            arr[i] = liste.get(i);
        }
        return arr;
    }
}