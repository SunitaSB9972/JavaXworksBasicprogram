package com.xworkz.prgm;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Cafe {
	
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			CafhePrgm dto1 = new CafhePrgm(1, "chikbyte" , " veg ", "hubli" , 3.5f);
			CafhePrgm dto2 = new CafhePrgm(2, "hattcafe", "veg", "rajajinagar", 2.2f);
			CafhePrgm dto3 = new CafhePrgm(3, "maddikattecafe", "nonveg","vijaynagar" , 2.8f );
			CafhePrgm dto4 = new CafhePrgm(4, "cafe1980", "veg", " basaveshwara nagar", 4.3f);
			CafhePrgm dto5 = new CafhePrgm(5, "art cafe", "nonveg", " btm ", 4.0f);
			
			
			
			Stream<CafhePrgm> s= Stream.of( dto1,dto2,dto3, dto4, dto5);
			
			s.filter((e)->e.getRatings()>3).sorted((e,e1)->e1.getName().compareTo(e.getName())).collect(Collectors.toList()).forEach((dto)->System.out.println(dto));
			
			
			
		}


}
