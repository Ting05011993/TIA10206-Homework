package Homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8_1 {

	public static void main(String args[]) {
		Object o = new Object();
		BigInteger b = new BigInteger("1000");

		List<Object> list = new ArrayList<Object>();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add((short) 100);
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add((Object) o);
		list.add("Snoopy");
		list.add(b);

		System.out.println("==== Iterator ====");
		Iterator<Object> objs = list.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());

		System.out.println("==== 傳統For迴圈 ====");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}

		System.out.println("==== For-each 迴圈 ====");
		for (Object xx : list)
			System.out.println(xx);

		System.out.println("==== 移除物件 ====");
		Iterator<Object> objs1 = list.iterator();
		while (objs1.hasNext()) {
			Object objNum = objs1.next();
			if (!(objNum instanceof Number)) {
				objs1.remove();
			} else {
				System.out.println(objNum);
			}
		}
	}

}
