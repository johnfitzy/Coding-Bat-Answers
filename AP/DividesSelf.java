public boolean dividesSelf(int n) {
    
    int smallerNum = n;
    int rightMost = smallerNum % 10;
    boolean b = false;
    
    while(smallerNum > 0){
	if(rightMost == 0) {
	    return false;
	}
	if(n % rightMost == 0){
	    b = true;
	}else{ 
	    return false;
	}
	smallerNum = smallerNum / 10;
	if(smallerNum < 10){
	    return n % smallerNum == 0;
	}
    }
    return b;
}
