import java.util.*;
class Student{}
class Rockstar{   }
class Hacker{}
   
public class Java_instanceof {
	static String count(ArrayList mylist){
	      int a = 0,b = 0,c = 0;
	      for(int i = 0; i < mylist.size(); i++){
	         Object element=mylist.get(i);
	         if(element instanceof Student)
	             a++;
	          if(element instanceof Rockstar)
	             b++;
	          if(element instanceof Hacker)
	             c++;
	      }
	      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
	      return ret;
	 }

	   public static void main(String []args){
	      ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      //int t = sc.nextInt();
	      int t = 5;
	      String[] s = {"Student","Student","Student","Rockstar","Hacker"};
	      for(int i=0; i<t; i++){
	       //  String s=sc.next();
	         if(s[i].equals("Student"))mylist.add(new Student());
	         if(s[i].equals("Rockstar"))mylist.add(new Rockstar());
	         if(s[i].equals("Hacker"))mylist.add(new Hacker());
	      }
	      System.out.println(count(mylist));	
	   }
}
