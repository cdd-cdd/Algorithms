package Stack;

import java.util.Stack;

import org.omg.CORBA.PUBLIC_MEMBER;

public class DijkstraInterpreter {

	private java.util.Stack<String> operationStack;
	private java.util.Stack<Double> valueStack;
	
	public DijkstraInterpreter() {
		this.operationStack = new Stack<>();
		this.valueStack = new Stack<>();
	}
	
	public void interpreExpression(String expression) {
		
		String[] expressionArray = expression.split(" ");
		
		for(String s : expressionArray) {
			if( s.equals("(")) {
				
			}else if(s.equals("+")){
				this.operationStack.push(s);
			}else if(s.equals("*")) {
				this.operationStack.push(s);
			}else if (s.equals(")")) {
				
				String operation = this.operationStack.pop();
				
				if(operation.equals("+")) {
					this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
				}else if(operation.equals("*")) {
					this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
				}
			}else {
				this.valueStack.push(Double.parseDouble(s));
			}
		}
		
 	}
	
	public void result() {
		System.out.println(this.valueStack.pop());
	}
}
