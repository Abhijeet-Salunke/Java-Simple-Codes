class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
            list.add(firstRow);
        if(numRows == 1)
            return list;
        
        for(int i = 1; i < numRows; i++){
            List<Integer> prevRow = list.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 0; j < i - 1; j++){
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            row.add(1);

            list.add(row);
        }
        return list;
    }
}