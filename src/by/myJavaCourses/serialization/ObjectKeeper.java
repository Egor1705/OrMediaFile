package by.myJavaCourses.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectKeeper {

	public void saveObjectList(List<Ob>objectList) {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
			oos.writeObject(objectList);
            System.out.println("File has been written");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void readObjectList() throws ClassNotFoundException{
		 List<Ob> newList= new ArrayList<Ob>();
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.txt"));
			
			newList = (List<Ob>) ois.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Ob ob: newList) {
			System.out.println("int value is "+ob.getIntValue()+"  name is "+ ob.getName()+
					" index of this object is "+ newList.indexOf(ob)+" \n");
			
		}
		
	}

	
	
}
