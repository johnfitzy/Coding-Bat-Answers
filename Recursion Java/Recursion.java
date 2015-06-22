public class Recursion{
  
  
  // array220 //
  public boolean array220(int[] nums, int index) {
    
    if(index + 1 == nums.length || nums.length < 1) return false;
    
    if(nums[index] * 10 == nums[index +1]){
      return true;
    }
    return array220(nums, index +1); 
  }
  
  
  
  // array6 //
  public boolean array6(int[] nums, int index) {
    
    if(index + 1 > nums.length) return false;
    
    if(nums[index] == 6){
      return true;
    }
    return array6(nums, index+1);
  }
  
  // array 11 //
  public int array11(int[] nums, int index) {
    
    if(index + 1 > nums.length) return 0;
    if(nums[index] == 11){
      return 1 + array11(nums, index +1);
    }
    return array11(nums, index +1);
    
  }
  
  public String changePi(String str) {
    
    if (str.length() < 2) return str;
    
    if (str.substring(0, 2).equals("pi")){
      return "3.14" + changePi(str.substring(2));
    }
    return str.charAt(0) + changePi(str.substring(1));
    
  }
  
  
  // allStar //
  public String allStar(String str) {
    
    if(str.length() == 1 || str.length() == 0) return str;
    return  str.charAt(0) + "*" + allStar(str.substring(1)) ;
    
  }
  
  
  // changeXY //
  public String changeXY(String str) {
    
    StringBuilder s = new StringBuilder();
    
    if(str.length() == 0){
      return s.toString();
    }
    
    if(str.charAt(0) != 'x'){
      s.append(str.charAt(0));
      
    }else if(str.charAt(0) == 'x'){
      
      s.append('y');
    }
    
    return s + changeXY(str.substring(1, str.length())); 
  }
  
  // countHi //
  public int countHi(String str) {
    int count = 0;
    if(str.length() == 1) return count;
    if(str.charAt(0) == 'h' && str.charAt(1) == 'i'){
      count += 1;
    }
    return count + countHi(str.substring(1, str.length()));
  }
  
  
  
  // countX //
  public int countX(String str) {
    int count = 0;
    if(str.length() == 0) return count;
    if(str.charAt(0) == 'x'){
      count += 1;
    }
    return count + countX(str.substring(1, str.length()));
  }
  
  
  
  
  
}




