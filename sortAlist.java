package Package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortAList {
	public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("CruzHacks");
        strList.add("ElleHacks");
        strList.add("HackDavis");
        strList.add("HacktheNorth");
        strList.add("HackED");
        strList.add("HacktheNortheastBeyond");
        strList.add("RoseHack");
        strList.add("SBHacks");
        
        // the list before sorting
        System.out.print("the list before sorting :\n");
        for(String str: strList) System.out.print(str +"\n");
        
        // the list after sorting 
        Collections.sort(strList);  
        System.out.print("the list after sorting : \n");
        for(String str: strList) System.out.print(str+"\n");
    }

}
