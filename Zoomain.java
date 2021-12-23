package com.xworkz.prgm;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Zoomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ZooExample z1 = new ZooExample(1, "binkadakattizoo" , " gadag " , 50);
		ZooExample z2 = new ZooExample(2, "mysoreZoo", "mysore", 100);
		ZooExample z3 = new ZooExample(3, "bellaryzoo", "bellary" , 80 );
		ZooExample z4 = new ZooExample(4, "bannerghattazoo", " bengalore", 150);
		ZooExample z5 = new ZooExample(5, "bhadrazoo", "shivamogha",  120);
		
Stream <ZooExample> str = Stream.of( z1,z2,z3,z4,z5);

str.filter((e)->e.getId()<5).sorted((e,e1)->e.getTicketPrice().compareTo(e1.getTicketPrice())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
	
	}


	}

