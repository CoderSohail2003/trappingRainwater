public class trappingRainwater{

    public static int trappedRainwater(int height[]){
        int n = height.length;
        // I will need here 2 auxillary arrays for comparing
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        // Making of leftMax array
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // making of rightMAX ARRAY
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trapRainwater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapRainwater += waterLevel - height[i];
        }
        return trapRainwater;




    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int height[] = {4, 8, 0, 1, 3, 2, 5};
        System.out.println("total trapped rainwater is : " + trappedRainwater(height));
        

        
        
    }
}