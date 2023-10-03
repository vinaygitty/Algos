class MinJumpToReachEnd {

    public static int minJump(int arr[]){
        
        int []jump = new int[arr.length];
        jump[0] = 0;
        for(int i=1; i < arr.length ; i++){
            jump[i] = Integer.MAX_VALUE-1;
        }
        
        for(int i=1; i < arr.length; i++){
            for(int j=0; j < i; j++){
                if(arr[j] + j >= i){
                    if(jump[i] > jump[j] + 1){
                        jump[i] = jump[j] + 1;
                    }
                }
            }
        }
        
        return jump[jump.length-1];
    }

    public static void main(String args[]){
        int arr[] = {1,3,5,3,2,2,6,1,6,8,9};
        int result = minJump(arr);
        System.out.println(result);

    }
}
