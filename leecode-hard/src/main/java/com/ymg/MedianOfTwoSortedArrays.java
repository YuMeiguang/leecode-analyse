package com.ymg;

/**
 * @author yumg
 * @create 2019/07/26
 * @desc
 * @since 1.0.0
 * TODO
 **/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] A = new int[5];A[0] = 1;A[1] = 2; A[2]=4;A[3]=6;A[4]=7;
        // 1,2,2,3,4,5,6,7
        int[] B = new int[3];B[0] = 2;B[1] = 4;A[2]=5;
        // 1 2 3 4 4
        System.out.println(findMedianSortedArrays(A,B));
        System.out.println(findMedianSortedArrays1(A,B));
    }

    public static double findMedianSortedArrays1(int[] A,int[] B){
        int m = A.length;
        int n = B.length;
        //交换m和n 保证n是大的
        if (m > n){
            int[] temp = A;A=B;B=temp;
            int tmp = m;m = n;n = tmp;
        }
        int i = 0,j=0;
        int k1 = 0,k2=0;
        if ((m+n)%2 == 1){
            k1 = (m+n+1)/2 -1 ;
        }else{
            k1 = (m+n+1)/2 -1 ;
            k2 = (m+n+2)/2 -1 ;
        }
        int flag = 0;

        while (i<m && j<n ){
            if (A[i]<B[j]){
                if (flag == k1){
                    return A[i];
                }
                i++;
            }else{
                if (flag == k1){
                    return B[j];
                }
                j++;

            }
            flag ++;

        }


        return new Double(0);

    }

    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            } else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            } else { // i is perfect
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = B[j-1];
                } else if (j == 0) {
                    maxLeft = A[i-1];
                } else {
                    maxLeft = Math.max(A[i-1], B[j-1]);
                }
                if ( (m + n) % 2 == 1 ) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(B[j], A[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

}
