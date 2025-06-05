class Intersection_Of_Sorted_Arrays{
    public static void Intersection(int[] a, int[] b){
    int[] intersection = new int[Math.min(a.length, b.length)];
    int k = 0;
    int i = 0, j = 0;
    while(i < a.length && j < b.length){
        if(a[i] == b[j]){
            intersection[k++] = a[i++];
            j++;
        }
        else if(a[i] < b[j]){
            i++;
        } 
        else{
            j++;
        }
    }
    if(k == 0){
        System.out.println("No common elements");
    }
    else{
        System.out.print("Intersection : ");
        for(int m=0;m<k;m++){
            System.out.print(intersection[m] + " ");
        }
        System.out.println();
    }
    
    }
    public static void main(String[] args){
        int[] a = {1, 1, 1, 1};
        int[] b = {1, 1};

        Intersection(a, b);
    }
}