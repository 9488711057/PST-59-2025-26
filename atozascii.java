package pst;

public class atozascii {

	public static void main(String[] args) {
		 printLetters();
   }
   static void printLetters() {
       for(char ch = 'a'; ch <= 'z'; ch++) {
           ascii1(ch);
       }
   }
   static void ascii1(char ch) {
       int ascii = ch;
       System.out.println(ch + " = " + ascii);
	}

}
