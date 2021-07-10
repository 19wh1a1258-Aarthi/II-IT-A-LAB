public class Duplicate_Characters
{  
     public static void main(String[] args) 
     {  
        String s = "Welcome to java program";  
        int count;  
        System.out.println("The entered string is: "+s);
        char str[] = s.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        for(int i = 0; i <str.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <str.length; j++) 
            {  
                if(str[i] == str[j] && str[i] != ' ') 
                {  
                    count++;  
                    str[j] = '0';  
                }  
            }  
            if(count > 1 && str[i] != '0')
            {
                System.out.println(str[i]);
            }
        }  
    }  
}  
