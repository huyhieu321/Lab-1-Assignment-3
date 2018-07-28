import java.util.*;
public class Java_interator{
	
   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
          Object element = it.next();
          if(element instanceof String && element.toString().equals("###")) break;
	  }
      return it;
   }
   
	@SuppressWarnings({ "unchecked" })
	public static void main(String []args){
		 ArrayList mylist = new ArrayList();
		 Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		 //int m = sc.nextInt();
		 mylist.add(42);
		 mylist.add(10);
//		 for(int i = 0;i<n;i++){
//		    mylist.add(sc.nextInt());
//		 }
		 
		 mylist.add("###");
//		 for(int i=0;i<m;i++){
//		    mylist.add(sc.next());
//
//		 }
		 mylist.add("hello");
		 mylist.add("Java");
		 
		 Iterator it=func(mylist);
		 while(it.hasNext()){
		    Object element = it.next();
		    System.out.println((String)element);
		 }
	}
}

