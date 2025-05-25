class Union_And_Intersection{
    public static void Intersection(int[] a, int[] b){
        int[] intersection = new int[Math.max(a.length, b.length)];
        int k = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    boolean flag = false;
                    for(int m =0;m<k;m++){
                        if(intersection[m] == a[i]){
                        flag = true;
                        break;
                        }
                    }
                    if(!flag){
                    intersection[k] = a[i];
                    k++;
                    }
                    break;
                }
            }
        }
        System.out.print("Intersection : ");
        for(int i=0;i<k;i++){
            System.out.print(intersection[i] + " ");
        }
        System.out.println();
    }

    public static void Union(int[] a, int[] b){
        int[] union = new int[a.length + b.length];
        int k = 0;
        for(int i=0;i<a.length;i++){
            int j;
            for(j=0;j<k;j++){
                if(a[i] == union[j]){
                    break;
                }
            }
            if(j==k){
                union[k] = a[i];
                k++;
            }
        }
        for(int i=0;i<b.length;i++){
            int j;
            for(j=0;j<k;j++){
                if(b[i] == union[j]){
                    break;
                }
            }
            if(j==k){
                union[k] = b[i];
                k++;
            }
        }
        System.out.print("Union : ");
        for(int i=0;i<k;i++){
            System.out.print(union[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 2};
        int[] b = {2, 3, 5, 7};
        Union(a, b);
        Intersection(a, b);
        
    }
    public static void printArray(int[] arr){
        for(int next : arr){
            System.out.print(next + " ");
        }
        System.out.println();
    }
}