/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *      |_  MelonChart
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 * 
 * @author : 홍승민
 * @version : 1.0
 */

public class MelonGenreChart {
	public static void main(String[] args) {
		List<Music>list = new ArrayList<Music>();
		List<Music>list1 = new ArrayList<Music>();
		Map<String, List<Music>> map = new HashMap<>();
		list1.add(new Music("팔레트","아이유"));
		map.put("발라드", list1);
	    list.add(new Music("I luv it", "PSY"));
	    list.add(new Music("맞지?","언니쓰"));
	    map.put("댄스", list);
	    System.out.println("-- << 멜론 장르별 차트 > --");
	    printMap(map);
	    System.out.println("-- << 댄스 2위 곡 변경 >> --");
	    list.set(1,new Music("SIGNAL","트와이스"));
	    printMap(map);
	   System.out.println("-- << 댄스 1위 곡 삭제 >> --");
	   list.remove(0);
	   printMap(map);
	   System.out.println("-- << 전체 리스트 삭제 >> --");
	    map.clear();
	    printMap(map);
	}

//	public static void printList(List<Music> list){
//		int i=1;
//		for(Music m : list){
//			System.out.println(i+". "+m.toString());
//			i++;
//		}	
//	}
	public static void printMap(Map<String, List<Music>> map){
		
		for(String key : map.keySet()){
			System.out.println("["+key+"]");
			int i = 1;
			for(Music s: map.get(key)){
				System.out.println(i+". "+ s);
				i++;
			}
		}
	}
}
