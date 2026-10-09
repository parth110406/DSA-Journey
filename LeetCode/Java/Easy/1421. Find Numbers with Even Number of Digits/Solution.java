class Solution {
    public int findNumbers(int[] nums) {
      int count = 0;
        for(int i=0;i<nums.length;i++){
          int numbers = nums[i];
           int digicount = 0;
           while(numbers>0){
            numbers = numbers/10;
            digicount++;

            } 
            if(digicount %2==0){
                count++;

           }

           
           
        } 
        return count;
    }
        
        
      
    
}