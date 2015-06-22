public class MoreRecursion{
  
  
  
  // noX //
  public String noX(String str) {
    if(str.length() < 1)return str;
    if(str.charAt(0) != 'x'){
      return str.charAt(0) + noX(str.substring(1));
    }
    return noX(str.substring(1));
  }
  
  
  // pairStar //
  public String pairStar(String str) {
    if (str.length() <= 1) {
      return str;
    }
    if (str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    }
    return str.charAt(0) + pairStar(str.substring(1)); 
  }
  
  // endX //
  public String endX(String str) {
    StringBuilder b = new StringBuilder();
    if (str.length() < 1) {
      return str;
    }
    if (str.charAt(0) == 'x') {
      b.append('x');
    } else if (str.charAt(0) != 'x') {
      return str.charAt(0) + endX(str.substring(1));
    }
    return endX(str.substring(1)) + b.toString();
  }
  
  
  // countPairs //
  public int countPairs(String str) {
    int count = 0;
    if(str.length() < 3) return count;
    if(str.charAt(0) == str.charAt(2)){
      count++;
    }
    return count + countPairs(str.substring(1));
  }
  
  // factorial //
  public int factorial(int n) { 
    if(n == 1) return n;
    return factorial(n -1) * n;
  } 
  
  
  // count11 //
  public int count11(String str) {
    if(str.length() < 2) return 0;
    String s = str.substring(1);
    if(str.charAt(0) == '1' && s.charAt(0) == '1'){
      return 1 + count11(s.substring(1));
    }
    return count11(str.substring(1)); 
  }
  
  // countABC //
  public int countAbc(String str) {
    int count = 0;
    if (str.length() < 3) {
      return count;
    }
    if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
      if (str.charAt(2) == 'c' || str.charAt(2) == 'a') {
        count++;
      }
    }
    return count + countAbc(str.substring(1));
    
  }
  
  // countHi2 //
  public int countHi2(String str) {
    if(str.length() < 2) return 0;
    if(str.charAt(0) == 'x' && str.charAt(1) == 'x'){
      return countHi2(str.substring(1));
    }
    if(str.charAt(0) == 'x'){
      return countHi2(str.substring(2));
    }
    if(str.charAt(0) == 'h' && str.charAt(1) == 'i'){
      return 1 + countHi2(str.substring(2));
    }
    return countHi2(str.substring(1));
  }
  
  
  // nestParen //
  public boolean nestParen(String str) {
    if(str.equals("") || str.equals("()")) return true;
    if(str.charAt(0) == '(' && str.charAt(str.length() -1) == ')'){
      return nestParen(str.substring(1, str.length() -1));
    }
    return false;
  }
  
  // parenBit //
  public String parenBit(String str) {
    if(str.length() == 1) return "";
    if(str.charAt(0) =='('){
      return str.substring(0, str.indexOf(')') +1 ) + parenBit(str.substring(1));
    }
    return parenBit(str.substring(1));
  }
  
  // strCopies //
  public boolean strCopies(String str, String sub, int n) {
    if (str.length() < sub.length()) return (n <= 0);
    if (str.substring(0, sub.length()).equals(sub)) {
      return strCopies(str.substring(1), sub, n - 1);
    }
    return strCopies(str.substring(1), sub, n);
  }
  
  
  
  // strCount //
  public int strCount(String str, String sub) {
    if(str.length() < sub.length()) return 0; 
    if(str.substring(0, sub.length()).equals(sub)){
      return 1 + strCount(str.substring(sub.length()), sub);
    }
    return strCount(str.substring(1), sub);
  }
  
  
  
  // strDist //
  public int strDist(String str, String sub) {
    if(str.length() < sub.length()) { return 0; }
    if(str.substring(0, sub.length()).equals(sub)) { 
      return str.substring(0, str.lastIndexOf(sub) + sub.length()).length();
    }
    return strDist(str.substring(1), sub);
  }
  
  // stringClean //
  public static stringClean(String str) {
    if (str.length() < 2) return str;
    if (str.charAt(0) == str.charAt(1)){
      return stringClean(str.substring(1));
    }
    return str.charAt(0) + stringClean(str.substring(1)); 
  }
  
  
  
}