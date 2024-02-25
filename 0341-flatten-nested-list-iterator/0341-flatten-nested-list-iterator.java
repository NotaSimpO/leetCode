
public class NestedIterator implements Iterator<Integer> {
    
    private List<Integer> flattenList;
    private int count = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        flattenList = new ArrayList<>();
        flattenList = toFlatten(nestedList);
    }

    @Override
    public Integer next() {
        int number = flattenList.get(count);
        count++;
        return number;
    }

    @Override
    public boolean hasNext() {
        if (count < flattenList.size()){
            return true;
        }
        return false;
    }
    List<Integer> toFlatten(List<NestedInteger> nestedList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nestedList.size();i++){
            if(nestedList.get(i).isInteger()){
                result.add(nestedList.get(i).getInteger());
            }else{
                result.addAll(toFlatten(nestedList.get(i).getList()));
            }
        }
        return result;
    }
}

