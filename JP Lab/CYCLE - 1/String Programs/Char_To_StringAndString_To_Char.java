class Char_To_StringAndString_To_Char
{
   public static void main(String args[])
   {
      char ch = 'r';
      String str = "HelloWorld";
      for(int i=0; i<str.length();i++){
      	ch = str.charAt(i);
        System.out.println("Character at "+i+" Position: "+ch);
      }
      System.out.println("String is: "+Character.toString(ch));
   }
}