public class Aswale{

public static void main(String[] args) {

String a,b="";
Scanner sc = new Scanner(System.in);
syso("Enter a string or no to be Palindrome");

a=sc.nextline();

int length=a.length();

for (int i=length-1;i>=0;i--) {

b=b+a.charAt(i);

if (a.contentequals(b)) {

syso("Entered String or No is Palindrome")


}

else {

syso("Entered String or No is Not Palindrome")

}




}







}







}