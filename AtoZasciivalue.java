package pst;

public class AtoZasciivalue {

	public static void main(String[] args) {
		 printLetters();
   }
   static void printLetters() {
       for(char ch = 'A'; ch <= 'Z'; ch++) {
           ascii1(ch);
       }
   }
   static void ascii1(char ch) {
       int ascii = ch;
       System.out.println(ch + " = " + ascii);
	}

}
