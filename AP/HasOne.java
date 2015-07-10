public boolean hasOne(int n) {

    while(n > 0){
	if(n % 10 == 1){
	    return true;
	}else{
	    n = n / 10;
	}
      
    }
    return false;
  
}
