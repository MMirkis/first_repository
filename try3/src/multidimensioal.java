public class multidimensioal {
    public static void  main(String[] args){

        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);

        int[] number1=new int[5];
        String [] [] strings= new String[2][3];
        strings[0][1]="privet";
        System.out.println(strings[0][1]);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
