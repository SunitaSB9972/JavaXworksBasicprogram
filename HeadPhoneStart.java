package com.xworkz.prgm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class HeadPhoneStart {
	public static void main(String[] args) {
		HeadPhoneDTO dto=new HeadPhoneDTO(13,"OnePlus buds","Wireless","1010 type-c", 4000);
		HeadPhoneDTO dto1=new HeadPhoneDTO(11,"Philips","Wired","shb8750nc", 500);
		HeadPhoneDTO dto2=new HeadPhoneDTO(14,"Noise Unisex Blue Solid","Wireless","VS103", 1499);
		HeadPhoneDTO dto3=new HeadPhoneDTO(12,"Boat","Wireless","rokerz 510", 999);
		HeadPhoneDTO dto4=new HeadPhoneDTO(15,"Apple","Wireless","Apple Airpods 2", 5500);
		
		List<HeadPhoneDTO> head=new ArrayList<HeadPhoneDTO>();
		head.add(dto4);
		head.add(dto3);
		head.add(dto2);
		head.add(dto1);
		head.add(dto);
		
		head.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).collect(Collectors.toList()).forEach((d)->System.out.println(d));
		System.out.println(System.lineSeparator());
		
		System.out.println(System.lineSeparator());
		head.stream().filter((t)->t.getType()=="Wireless").sorted((e1,e2)->e1.getBrand().compareTo(e2.getBrand())).collect(Collectors.toList()).forEach((a)->System.out.println(a));
	
		System.out.println(System.lineSeparator());
      head.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).map((a)->a.getModel()).collect(Collectors.toList()).forEach((a)->System.out.println(a));
	}

}
