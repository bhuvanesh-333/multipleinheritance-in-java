interface readable{
	void read();
}
interface writeable {
	void write();
}
interface storeable{
	void store();
	
}

class file implements readable,writeable,storeable{

	@Override
	public void store() {
		System.out.println("you can store the data");
		
	}

	@Override
	public void write() {
		System.out.println("you can write the data");
		
	}

	@Override
	public void read() {
		System.out.println("you can read the data");
	}
	
}
public class day8 {
public static void main(String[] args) {
		file a=new file();
		a.read();
		a.write();
		a.store();
		

	

}}
