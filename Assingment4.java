import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Assingment{

    static boolean Anagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] chArry1 = s1.toCharArray();
        char[] chArry2 = s2.toCharArray();

        Arrays.sort(chArry1);
        Arrays.sort(chArry2);

        return Arrays.equals(chArry1, chArry2);
    }

    private static boolean isPanagram(String s){

        if(s.length()<26){
            return false;
        }else{
            for(char cr = 'a'; cr <= 'z'; cr++){
                if(s.indexOf(cr)<0){
                    return false;
                }

            }
        }
        
        return true;
       
        
    }

    public static String removeDublicateString(String Str){
        String str = "";

        for(int i=0; i<Str.length();i++){
            char cr = Str.charAt(i);
            if (str.indexOf(cr)==-1) {

                str = str+cr;

                
            }
            
        }



        return str;
    }
    

    public static boolean findUniqcharedter(String s){
        
        Set hs = new HashSet();
        int count = 0;
        for(int i = 0;i<s.length(); i++){
            char cr = s.charAt(i);
            boolean has = hs.add(cr);
            if (has==false) {
              
                return false;
                
                
            }

        }
        return true;



    }
    public static void main(String[] args) {

        System.out.println("AnnagramCheck Statred......");
        String str1 = "listen";
            String str2 = "silent";
            if (Anagrams(str1, str2)) {
                System.out.println(str1 +" and " +str2 +" Are Anagram");
                               
            }else{
                System.out.println(str1 +" and " +str2 +"Not Anagram");
            }
        System.out.println("AnnagramCheck Ended......");
        System.out.println();

         System.out.println("MaxOccuringCharecter check Statred......");    
        String strr = "rohitmbnasdas,zxvsdfl,;fgwiojqwhaslmkas;d";
        int mx = -1;
        char result = 0;
        int[] count = new int[256];
        for(int i =0; i<strr.length(); i++){
            count[strr.charAt(i)]++;
        }
        for(int i = 0; i<strr.length();i++){
            if(mx<count[strr.charAt(i)]){
                mx = count[strr.charAt(i)];
                result = strr.charAt(i);
            }
        }
        System.out.println("The most occured charecter are "+result);

        System.out.println("MaxOccuringCharecter check Ended......");
        System.out.println();

        System.out.println("IsPanagram started......");
          boolean resul = false;
        String str = "Glib jocks quiz nymph to vex dwarf";
        if(isPanagram(str.toLowerCase())==resul){
            System.out.println("this words ar not Anagram");
            
        }else{
            System.out.println("This words are Panagram");
        }

        System.out.println("IsPanagram started......");
        System.out.println();

            System.out.println("plindrone started......");
          int n = 2552;
        int c=n,r,s=0;
        while (n>0) {
            r=n%10;
            s=(s*10)+r;
            n=n/10;

                
        }
        if(c==s){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome number");
        }

        System.out.println("plindrone started......");
        System.out.println();

System.out.println("PrintDublicate Charecter started......");
      String st = "TestStringDublicates";
      int coun = 0;
      char[] chr = st.toCharArray();
      for(int i=0; i<chr.length;i++){
            for(int j = i+1; j<chr.length;j++ ){
                if (chr[i]==chr[j]) {
                    System.out.println("the dublicate String are : "+chr[j]);
                    coun++;
                
                }
            }
      }System.out.println("The count of the dublicate charecter : "+coun);
System.out.println("PrintDublicate Charecter ended......");
        System.out.println();
System.out.println("Count the vowels and special charedter started......");
         String sr = "Greatefull to join INEuRON @@@";
        str = sr.toLowerCase();
        int v=0,ct=0,sp=0;
        char ch;
        for(int i=0; i<str.length(); i++){
                ch = str.charAt(i);
                if(ch>='a' && ch <='z' ){
                    if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
                        v++;
                    }else{
                        ct++;
                    }
                }else if (ch == ' ') {

                    
                }else{
                    sp++;
                }
                 
            }
            System.out.println("The count of Vowel is :: "+ v);
            System.out.println("The count of Consonent is :: "+ ct);
            System.out.println("The count of Special Charecter is :: "+ sp);
            System.out.println("Count the vowels and special charedter ended......");
            System.out.println();

System.out.println("Remove Dublicate Started.....");
             String newStr= "ahfsacbfhgthashcabhgfs";

        System.out.println("OLD String is " +newStr);
        System.out.println("After removing the dublicate the string is "+removeDublicateString(newStr));
        System.out.println("Remove Dublicate ended.....");
        System.out.println();

        System.out.println("StringUniqueCharecter Started..........");
        String ssr = "abc";
        boolean rs = true;
        if (findUniqcharedter(ssr.toLowerCase())== rs) {
            System.out.println("All String Are Unique");
            
        }else{
        System.out.println("there are some common values");}
        System.out.println("StringUniqueCharecter Ended..........");

    }
        
    }

