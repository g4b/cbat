public class Runner {

        public static void main(String[] args){

            System.out.println(loneTeen(15,16));
            System.out.println(loneTeen(19,20));

            System.out.println(stringSplosion("WHaaaat??"));
            System.out.println(stringSplosion("hello"));

            System.out.println(extraFront("Espanol")); // --> "EspEspEsp"
            System.out.println(extraFront("Penultimate")); // --> "PenPenPen"

            System.out.println(bobThere("xyzbobzyxb4bbbobb")); // --> true
            System.out.println(bobThere("BabBebBibB0bBub")); // --> false

            System.out.println(countTriple("wheeeerreerrree!!!")); // --> 3
            System.out.println(countTriple("abcdefyzziiiljk")); // --> 1

            System.out.println(lessBy10(10,20,29)); // --> true
            System.out.println(lessBy10(42, 35, 39)); // --> false

            System.out.println(luckySum(8,13,2)); // --> 10
            System.out.println(luckySum(13,13,13)); // --> 0

            int[] a1 = {1,2,3};
            int[] b1 = {3,2,2};
            int[] a2 = {9,9,9};
            int[] b2 = {8,8,8};
            System.out.println(commonEnd(a1, b1)); // --> true
            System.out.println(commonEnd(a2, b2)); // --> false

            int[] nums1 = {3,4,5,7,8,7,9,7,7};
            int[] nums2 = {7,1,1,7,1,7};
            System.out.println(has77(nums1)); // --> true
            System.out.println(has77(nums2)); // --> true

            System.out.println(seriesUp(5)); // --> {1,1,2,1,2,3,1,2,3,4,1,2,3,4,5}
            System.out.println(seriesUp(9)); // --> {1,1,2,1,2,3...1,2,3,4,5,6,7,8,9}
        }

        // warmup1
        public static boolean loneTeen(int a, int b){
            return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) && !((a >= 13 && a <= 19) && (b >= 13 && b <= 19));
        }

        // warmup2
        public static String stringSplosion(String str) {
            String output = "";
            for (int i = 0; i < str.length(); i++){
                output += str.substring(0, i + 1);
            }
            return output;
        }

        // string1
        public static String extraFront(String str) {
            String output = "";
            if (str.length() >= 3){
                for (int i = 0; i < 3; i++){
                    output += str.substring(0, 2);
                }
            } else {
                for (int i = 0; i < 3; i++){
                    output += str;
                }
            }
            return output;
        }

        //string2
        public static boolean bobThere(String str) {
            char b = 'b';
            for (int i = 2; i < str.length(); i++) {
                if ((str.charAt(i) == b && str.charAt(i - 2) == b)) {
                    return true;
                }
            }
            return false;
        }

        //string3
        public static int countTriple(String str) {
            int tripleCount = 0;
            for (int i = 0; i < str.length() - 2; i++){
                if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i + 2)){
                    tripleCount++;
                }
            }
            return tripleCount;
        }

        //logic1
        public static boolean lessBy10(int a, int b, int c) {
            boolean aCase = (a - b >= 10) || (a - c >= 10);
            boolean bCase = (b - a >= 10) || (b - c >= 10);
            boolean cCase = (c - a >= 10) || (c - b >= 10);
            return (aCase || bCase) || cCase;
        }

        //logic2
        public static int luckySum(int a, int b, int c) {
            int sum;
            if (a == 13){
                sum = 0;
            } else if (b == 13){
                sum = a;
            } else if (c == 13){
                sum = a + b;
            } else {
                sum = a + b + c;
            }
            return sum;
        }

        //array1
        public static boolean commonEnd(int[] a, int[] b) {
            int aLen = a.length;
            int bLen = b.length;
            return (a[0] == b[0] || a[aLen - 1] == b[bLen - 1]);
        }

        //array2
        public static boolean has77(int[] nums) {
            for (int i = 2; i < nums.length; i++){
                if (nums[i] == 7 && (nums[i - 2] == 7 || nums[i - 1] == 7) ){
                    return true;
                }
            }
            return false;
        }

        //array3
        public static int[] seriesUp(int n) {
            int[] finalArr = new int[n*(n+1)/2];
            int countUp = 0;
            for (int i = 1; i < n + 1; i++){
                for (int j = 1; j < i + 1; j++){
                    finalArr[countUp] = j;
                    countUp++;
                }
            }
            return finalArr;
        }

    }
