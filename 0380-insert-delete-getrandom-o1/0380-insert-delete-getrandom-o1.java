class RandomizedSet {
    List<Integer> data;
    Random rand;

    public RandomizedSet() {
        data = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (data.contains(val)) {
            return false;
        }
        data.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!data.contains(val)){
            return false;
        }
        data.remove(Integer.valueOf(val));
        return true;
    }

    public int getRandom() {
        return data.get(rand.nextInt(data.size()));

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */