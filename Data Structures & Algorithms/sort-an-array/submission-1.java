class Solution {
    public int[] sortArray(int[] nums) {
        mergeShort(nums, 0, nums.length -1);
        return nums;
    }

    private void mergeShort(int[] arr, int l, int r){
        if (l >= r) return;

        int m = (l + r) /2;
        mergeShort(arr, l, m);
        mergeShort(arr, m+1, r);
        merge(arr, l, m, r);
    }

    private void merge(int[] arr, int l, int m, int r){
        List<Integer> tmp = new ArrayList<>();
        int i = l;
        int j = m + 1;

        while(i <= m && j <= r){
            if (arr[i] <= arr[j]){
                tmp.add(arr[i]);
                i++;
            } else {
                tmp.add(arr[j]);
                j++;
            }
        }

        while (i <= m){
            tmp.add(arr[i]);
            i++;
        }

        while(j <= r){
            tmp.add(arr[j]);
            j++;
        }

        for(i = l; i<= r; i++){
            arr[i] = tmp.get(i -l);
        }
    }
}