package BasicPrograms;
class Rectangle{
//            ***********
//            ***********
//            ***********
        public static void main(String[] args) {
            int rows=3;
            int cols=10;
            for (int i = 1; i <=rows ; i++) {
                for (int j = 1; j <=cols ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}

class HollowRectangle{
//            ***********
//            *         *
//            *         *
//            ***********
        public static void main(String[] args) {
            int rows=4;
            int cols=10;
            for (int i = 1; i <=rows ; i++) {
                for (int j = 1; j <=cols ; j++) {
                    if(i==1 || i==rows || j==1 || j==cols){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}

class LeftTriangle{
//    *
//    **
//    ***
//    ****
//    *****
        public static void main(String[] args) {
            int rows=5;
            for (int i = 1; i <=rows ; i++) {
                for (int j = 1; j <i+1 ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}

class ReverseLeftTriangle{
//    *****
//    ****
//    ***
//    **
//    *
    public static void main(String[] args) {
        int rows=5;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows+1-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pyramid{
//        *
//       ***
//      *****
//     *******
//    *********
    public static void main(String[] args) {
        int rows=5;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");
            }
            for (int k =1 ; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class NumRectangle{
//    1 2 3 4 5 6 7
//    2 3 4 5 6 7 1
//    3 4 5 6 7 1 2
//    4 5 6 7 1 2 3
//    5 6 7 1 2 3 4
//    6 7 1 2 3 4 5
//    7 1 2 3 4 5 6
    public static void main(String[] args) {
        int rows=7;
        int cols=7;
        for (int i = 1; i <=rows ; i++) {
            for (int j = i; j <=rows ; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

class NumRectangle2{
//    1 2 3 4 5 6
//    1 2 3 4 5 6
//    1 2 3 4 5 6
//    1 2 3 4 5 6
    public static void main(String[] args) {
        int rows=4;
        int cols=6;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=cols ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class NumRectangle3{
//    1 2 1 2 1 2
//    2 1 2 1 2 1
//    1 2 1 2 1 2
//    2 1 2 1 2 1
    public static void main(String[] args) {
        int rows=4;
        int cols=6;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=cols ; j++) {
                if ((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(2 + " ");
                }
            }
            System.out.println();
        }
    }
}

class NumTriangle{
//    1
//    1 2
//    1 2 3
//    1 2 3 4
    public static void main(String[] args) {
        int rows=4;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class NumPyramid{
//          1
//        1 2 1
//      1 2 3 2 1
//    1 2 3 4 3 2 1
    public static void main(String[] args) {
        int rows=4;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}