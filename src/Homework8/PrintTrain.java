package Homework8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintTrain {

	public static void main(String args[]) {
		Set<Train> set = new HashSet<Train>();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));

//		HashSet Train = new HashSet(set);
		System.out.println("==== Iterator ====");   //需搭配toString方法轉為String
		Iterator<Train> objs = set.iterator();
		while(objs.hasNext()) {
			System.out.println(objs.next());
			}
		
		System.out.println("==== For-each 迴圈 ====");
		for(Train t : set) {
			System.out.println(t);
		}
	}
}
