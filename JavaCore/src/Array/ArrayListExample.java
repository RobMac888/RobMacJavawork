package Array;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
	    int[] x=new	int[5];
	    ArrayList list=new ArrayList();
	    list.add("Rob");
	    list.add(12.55);
	    list.add(1234);
	    list.add(true);
	    list.add('Y');
	    System.out.println(list);
	    
	    ArrayList<String> names=new ArrayList(4);
	    //ArrayList<String> names=new ArrayList<String>();
	    names.add("Rob");
	    names.add("Hilda");
	    names.add("Arifi");
	    names.add("Arifi");
	    names.add("Hasan");
	    names.add("Kev");
	    System.out.println(names);
	    System.out.println(names.size());
	    System.out.println(names.get(5));
	    

	}

}
