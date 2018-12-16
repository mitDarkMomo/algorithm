package xiaoyi;

public class Binary {

    /**
     * 查找第一个值等于给定值的元素
     * @param a
     * @param length
     * @param value
     */
    public static int find1(int[] a, int length, int value) {
        if(length < 1) {
            return -1;
        }

        int left = 0;
        int right = length - 1;
        int middle = 0;

        while(left <= right) {
            middle = left + ((right - left) >> 1);
            if(a[middle] > value) {
                right = middle - 1;
            }else if(a[middle] < value) {
                left = middle + 1;
            }else {
                if(middle == 0 || a[middle - 1] != value) {
                    return middle;
                }
                right = middle - 1;
            }
        }

        return middle;
    }

    /**
     * 查找最后一个值等于给定值的元素
     * @param a
     * @param length
     * @param value
     */
    public static int find2(int[] a, int length, int value) {
        if(length < 1) {
            return -1;
        }

        int left = 0;
        int right = length - 1;
        int middle = 0;

        while(left <= right) {
            middle = left + ((right - left) >> 1);
            if(a[middle] > value) {
                right = middle - 1;
            }else if(a[middle] < value) {
                left = middle + 1;
            }else {
                if(middle == length - 1 || a[middle + 1] != value) {
                    return middle;
                }
                left = middle + 1;
            }
        }

        return middle;
    }

    /**
     * 查找第一个大于等于给定值的元素
     * @param a
     * @param length
     * @param value
     */
    public static int find3(int[] a, int length, int value) {
        if(length < 1) {
            return -1;
        }

        int left = 0;
        int right = length - 1;
        int middle = 0;

        while(left <= right) {
            middle = left + ((right - left) >> 1);
            if(a[middle] >= value) {
                if(middle == 0 || a[middle - 1] < value) {
                    return middle;
                }
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }

        return middle;
    }

    /**
     * 查找最后一个小于等于给定值的元素
     * @param a
     * @param length
     * @param value
     */
    public static int find4(int[] a, int length, int value) {
        if(length < 1) {
            return -1;
        }

        int left = 0;
        int right = length - 1;
        int middle = 0;

        while(left <= right) {
            middle = left + ((right - left) >> 1);
            if(a[middle] <= value) {
                if(middle == length - 1 || a[middle + 1] > value) {
                    return middle;
                }
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }

        return middle;
    }
}