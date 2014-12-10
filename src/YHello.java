import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import org.omg.CORBA.ExceptionList;


public class YHello {

	public void a() {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		System.out.println("d");
		System.out.println("e");
	}
	
	public int b() {
		
		int a = f();
		int b = 5;
			
		if (a == 0) {
			a = a+b;
			f();
		}
		else
		{
			a = b-a;
		}
		
		d();
		System.out.println(a);
		System.out.println(b);
		
		while (b != 7)
			b++;
		
		for (int i = 0; i < b; i++){
			a = a+b;
			b = a+1;
		}
		
		
		return 0;
	}
	
	public void c() {
		switch(5) {
		case 1:
			break;
		default:
			break;
		}
	}
	
	public void d() {
		
		ArrayList listA = new ArrayList();

		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 2");
		
		for(Object object : listA) {
		    String element = (String) object;
		}
		
	}
	
	
	public void e() {
		int i = 0;
		
		while (i < 10)
		{
			String j = "";
			i = i+1;
		}
		
		d();
	}
	
	public void g() {
		int j = 0;
		
		while (j < 10)
		{
			String k = "";
			j = j+1;
		}
		
		d();
	}
	
	public int f() {
		int i = 0;
		try {
			i = 1;
		} catch (Exception e) {
			i = 2;
			throw new RuntimeException(e);
		} catch (OutOfMemoryError e) {
			i = 3;
		}
		return 0;
	}
	
	public int h() {
		int i = 0;
		try {
			i = 1;
		} catch (Exception e) {
			i = 2;
			throw new RuntimeException(e);
		} catch (OutOfMemoryError e) {
			i = 3;
		}
		return 0;
	}

		
}

