package com.xworkz.prgm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TempleExample {
	public static void main(String[] args) {
	
	TempleDTO d1=new TempleDTO(1,"Shri kallinathershwara","koppel","Shiva",3000);
	TempleDTO d2=new TempleDTO(2,"shri siddharoodh matha","hubli","siddharoodh swamiji", 10000);
	TempleDTO d3=new TempleDTO(3,"shri savadatti Yellamma Devi","Savadatti","Yellamma", 7000);
	TempleDTO d4=new TempleDTO(4,"Shri Banashankari devi ","Badami","Shakambhari", 4000);
	TempleDTO d5=new TempleDTO(5,"Shri kukunur mahamaye","kukunur","dyammamma devi", 5000);
	
	List<TempleDTO> temple=new ArrayList<TempleDTO>();
	
			temple.add(d1);
			temple.add(d2);
			temple.add(d3);
			temple.add(d4);
			temple.add(d5);
	
    temple.stream()
       .filter((a)->a.getVisitorsPerDay()<10000)
	   .sorted((a1,a2)->a2.getVisitorsPerDay().compareTo(a1.getVisitorsPerDay()))
	   .collect(Collectors.toList()).forEach((e)->System.out.println(e));
}
}
