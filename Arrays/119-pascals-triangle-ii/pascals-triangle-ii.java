class Solution {
    public List<Integer> getRow(int rowIndex) {

        /**
        *   Collections.nCopies() is to return an immutable list which contains n       *   copies of given object.      
        */
        List<Integer> row = new ArrayList<>(Collections.nCopies(rowIndex + 1, 1));

        for(int i = 1; i < rowIndex; i++){

            for(int j = i; j > 0; j--){
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
        
    }
}