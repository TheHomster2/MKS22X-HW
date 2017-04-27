
public class ExpressionTree{
  
  /*return the value of the specified expression tree*/
  public double evaluate(){
    if (isValue() == true){
	return getValue();
}
	else{
	return 
    return 0.0;
  }
  
  /*return the expression as an infix notation string with parenthesis*/
  /* The sample tree would be: "( 3 + (2 * 10))"     */
  public String toString(){
	String result = "";
    if (isValue() == true){
	result += getValue();
}
else{
	return "(" + getLeft() + getOp() + getRight() + ")";
}
    return "";
  }
  
  /*return the expression as a postfix notation string without parenthesis*/
  /* The sample tree would be: "3 2 10 * +"     */
  public String toStringPostfix(){
    String result = "";
	if (isValue() == true){
	result += getValue();
}
else{
	return getLeft() + getRight() + getOp() + "";
}
    return "";
  }
  
  /*return the expression as a prefix notation string without parenthesis*/
  /* The sample tree would be: "+ 3 * 2 10"     */
  
  public String toStringPrefix(){
    String result = "";
	if (isValue() == true){
		result += getValue();
}
else{
	return isOp() + getLeft() + getRight() + "";
    return "";
  }
  
  
  
  
  
  
  private char op;
  private double value;
  private ExpressionTree left,right;
  
  /*TreeNodes are immutable, so no issues with linking them across multiple
  *  expressions. The can be constructed with a value, or operator and 2
  * sub-ExpressionTrees*/
  public ExpressionTree(double value){
    this.value = value;
    op = '~';
  }
  public ExpressionTree(char op,ExpressionTree l, ExpressionTree r){
    this.op = op;
    left = l;
    right = r;
  }
  
  
  
  public char getOp(){
    return op;
  }
  
  /* accessor method for Value, precondition is that isValue() is true.*/
  private double getValue(){
    return value;
  }
  /* accessor method for left, precondition is that isOp() is true.*/
  private ExpressionTree getLeft(){
    return left;
  }
  /* accessor method for right, precondition is that isOp() is true.*/
  private ExpressionTree getRight(){
    return right;
  }
  
  private boolean isOp(){
    return hasChildren();
  }
  private boolean isValue(){
    return !hasChildren();
  }
  
  private boolean hasChildren(){
    return left != null && right != null;
  }
