class Alternating_Pos_And_Neg{
    public static void alternating_pos_and_neg(int[] arr){
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int m = 0,n = 0;
        for(int i : arr){
            if(i<0){
                neg[n] = i;
                n++;
            }else{
                pos[m] = i;
                m++;
            }
        }
        int i=0,j=0,k=0;

        while(i < m && j < n){
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }

        while(i < m){
            arr[k++] = pos[i++];
        }

        while(j < n){
            arr[k++] = neg[j++];
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, -4, -1, 4};

        System.out.println("Original Array : ");
        printArray(arr);

        alternating_pos_and_neg(arr);
        
        System.out.println("Updated Array : ");
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int next : arr){
            System.out.print(next + " ");
        }
        System.out.println();
    }

}