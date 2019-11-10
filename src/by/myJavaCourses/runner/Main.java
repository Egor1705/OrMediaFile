package by.myJavaCourses.runner;

import java.util.ArrayList;
import java.util.List;

import by.myJavaCourses.serialization.Ob;
import by.myJavaCourses.serialization.ObjectKeeper;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
List<Ob>ob = new ArrayList<>();

Ob o = new Ob(1,"Object1");
Ob o1 = new Ob (2,"Object2");

ob.add(o);
ob.add(o1);

ObjectKeeper ob1 = new ObjectKeeper();
ob1.saveObjectList(ob);
ob1.readObjectList();
	}

}
