class Pascal_Triangle{
    public static void printPascalTriangle(int row){

        for(int i=0; i<row ;i++){
            int number = 1;

            for(int k=0; k<row-i-1; k++){
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print(number + " ");

                number = (number * (i-j))/(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        printPascalTriangle(n);
    }
}