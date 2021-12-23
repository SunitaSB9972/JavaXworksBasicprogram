
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RiverStart {
	
public static void main(String[] args) {
	
	RiverDTO dto=new RiverDTO(1,"Gangas","Uttarkhand",2510,24);
	RiverDTO dto1=new RiverDTO(2,"Brahmaputra","Arunchal Pradesh",340,34);
	RiverDTO dto2=new RiverDTO(3,"Tunga","Karnataka ",147,25);
	RiverDTO dto3=new RiverDTO(4,"Kaveri","Karnataka and Tamilnadu",805,33);
	RiverDTO dto4=new RiverDTO(5,"Krishna","Vijaywada and Sangali",1400,23);

	 Stream<RiverDTO> rvr=Stream.of(dto,dto1,dto2,dto3,dto4);
	 
	List<RiverDTO> tmp=rvr.filter((a)->a.getLength()>500).sorted((d1,d2)->d2.getNoOfDams().compareTo(d1.getNoOfDams())).collect(Collectors.toList());
        tmp.forEach((a)->System.out.println(a));
        	System.out.println(System.lineSeparator());
        
        Stream<RiverDTO> rvr1=Stream.of(dto,dto1,dto2,dto3,dto4);
        
    	List<RiverDTO> tmp1=rvr1.filter((a)->a.getNoOfDams()>20).sorted((d1,d2)->d1.getNoOfDams().compareTo(d2.getNoOfDams())).collect(Collectors.toList());
            tmp1.forEach((e)->System.out.println(e));

        
}
}