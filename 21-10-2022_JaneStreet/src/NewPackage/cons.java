package NewPackage;

public class cons {

	  int firstNum;
	  int secondNum;
	  
	  public cons (int firstNum, int secondNum) {
		  this.firstNum = firstNum;
		  this.secondNum = secondNum;
	  }
	  
	  public int car() {
		  
		  return this.firstNum;
	  }

	  public int cdr() {
		  
		  return this.secondNum;
	  }

}

