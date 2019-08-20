package com.ymg;

/**
 * @author yumg
 * @create 2019/07/26
 * @desc Leetcode 4
 * @since 1.0.0
 * TODO
 **/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] A = {1,2,3,5,6,8,9};
        int[] B = {7,9,10,12};
        // 1 2 3 4 4
        System.out.println(findMedianSortedArrays3(A,B));
    }

    public static double findMedianSortedArrays3(int[] nums1,int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int len = m+n;
        if (len%2==0){
            double left = findKthHelper1(nums1,0,nums2,0,len/2);
            double right = findKthHelper1(nums1,0,nums2,0,len/2 +1);
            return left+right;
        }else{
            return findKthHelper1(nums1,0,nums2,0,len/2 +1);
        }
    }


    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int len = m + n;
        if(len % 2 == 0){
            double left =  (double)findKthHelper(nums1, 0, nums2, 0, len/2);
            double right =  (double)findKthHelper(nums1, 0, nums2, 0, len/2 + 1);
            return (double)(left + right)/2;
        }else{
            return findKthHelper(nums1, 0, nums2, 0, len/2 + 1);
        }
    }

    private static double findKthHelper1(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart >= A.length){
            return B[bStart+k-1];
        }
        if (bStart >= B.length){
            return A[aStart+k-1];
        }

        if (k == 1){
            return Math.min(A[aStart],B[bStart]);
        }

        int aMid = aStart + k/2 -1;
        int bMid = bStart + k/2 -1;
        int aVal = aMid >= A.length ? Integer.MAX_VALUE:A[aMid];
        int bVal = bMid >= B.length ? Integer.MAX_VALUE:B[bMid];
        if (aVal <= bVal){
            return findKthHelper1(A,aMid+1,B,bStart,k-k/2);
        }else{
            return findKthHelper1(A,aStart,B,bMid+1,k-k/2);
        }

    }

    private static int findKthHelper(int[] A, int aStart, int[] B, int bStart, int k){
        if(aStart >= A.length){
            return B[bStart + k - 1];
        }
        if(bStart >= B.length){
            return A[aStart + k - 1];
        }
        if(k == 1){
            return Math.min(A[aStart], B[bStart]);
        }
        int aMid = aStart + k/2 - 1;
        int bMid = bStart + k/2 - 1;
        int aVal = aMid >= A.length ? Integer.MAX_VALUE : A[aMid];
        int bVal = bMid >= B.length ? Integer.MAX_VALUE : B[bMid];
        if(aVal <= bVal){
            return findKthHelper(A, aMid + 1, B, bStart, k - k/2);
        }else{
            return findKthHelper(A, aStart, B, bMid + 1, k - k/2);
        }
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
