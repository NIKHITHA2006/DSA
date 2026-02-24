class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;


        int left = 0, right = n - 1;
        while (left < right) {
            if (!Character.isLowerCase(arr[left])) {
                left++;
            } else if (!Character.isLowerCase(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

     
        left = 0;
        right = n - 1;
        while (left < right) {
            if (Character.isLowerCase(arr[left])) {
                left++;
            } else if (Character.isLowerCase(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }
}