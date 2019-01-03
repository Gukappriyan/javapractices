package test;

public class UserInput {

	static String TextValue = new String("");
	public static class TextInput {
		public void add(char c) {
			TextValue = new String (TextValue.toString() + c);
		}
		
		public String getValue() {
			return TextValue;
			}
	}
	

	public static class NumericInput extends TextInput {
		@Override
		public void add(char c) {
			
			if (c >= '0' && c <= '9') { 
				TextValue = new String (TextValue.toString() + c); 
				}
		}
	}

	public static void main(String[] args) {
		TextInput input = new NumericInput();
		 input.add('1');
		 input.add('a');
		 input.add('0');
		 System.out.println(input.getValue());
	}
}
