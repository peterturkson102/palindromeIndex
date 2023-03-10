class Result {
 /*
 * Complete the 'palindromeIndex' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */
 public static int palindromeIndex(String s) {
 // Write your code here
 int index = -1;
 for(int i =0,a=s.length()-1;i<s.length();i++,a--){
 if(s.charAt(a)!=s.charAt(i)){

 if(s.charAt(i+1)==s.charAt(a)&&s.charAt(i+2)==s.charAt(a-1)){
 index=i;

 }else{
 index=a;

 }
 break;
 }
 }

 return index;
 }
}
