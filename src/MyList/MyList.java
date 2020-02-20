package MyList;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class MyList {
	   private int times;
	   private String artists;
	
	public static void main(String[] args) throws IOException{
       
		FileInputStream fileName = new FileInputStream("weekly.csv");
        Scanner fileInput = new Scanner(fileName);
       
        ArrayList<String> names = new ArrayList<String>(); 
       
        ArrayList<Integer> count = new ArrayList<Integer>(); 
       
        
        while (fileInput.hasNextLine()) {
	    	String data = fileInput.nextLine();
	    	String [] values = data.split(",");
	    	String value = values[2];
	    	
	    	if(names.contains(value)) {
	    		int index = names.indexOf(value);
	    		count.set(index, count.get(index)+1);
	    	}
	    	else {
	    		names.add(value);
	    		count.add(1);
	    	}
	    	
	    }
        
        fileInput.close();
        fileName.close();
        
        for(int i =0; i< names.size(); i++) {
        	System.out.println(names.get(i)+"\t"+ "        "+count.get(i)+"\t");
        	
        }
        
     }
	
	public int getTimes() {
		return times;
	}
	public void setTime(int times) {
		this.times =times;
	}
	public String getArtists() {
	       return artists;
	   }
	   public void setArtists(String artists) {
	       this.artists = artists;
	   }
	   public MyList(int times, String artists) {
	       super();
	       this.times = times;
	       this.artists = artists;
	       
	   

	   
	   List<MyList> MyList = new ArrayList<MyList>();
	   Collections.sort(MyList, new Comparator<MyList>() {
	        public int compare(MyList p1, MyList p2) {
	            String artists1 = p1.getArtists();
	            String artists2 = p2.getArtists();
	            return artists1.compareTo(artists2);

	        }
	   }

);
	   }
	   
}



















//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//import java.util.List;
//
//public class MyList {
//public static void main(String[] args) {
//      
//       try {
//    	   List<String> lines = Files.readAllLines(Paths.get("C:/Users/xiuli/Desktop/eclipse_workspace/document/weekly.csv"));
//    	   for(String line : lines) {
////    		   line = line.replace("\"", "");
//    		   
//    		   String []result = line.split(",");
//    		  
//    		   System.out.println(result);	
//    	   }
//		    
//		    
//		   
//		    
//		    } catch (Exception e) {
//		    	// TODO Auto-generated catch block
//		    	System.out.println(e.getMessage());
//		    	}
//
//    }
//}
//








































