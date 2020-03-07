package Logging4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction {
	private static final Logger LOGGER = LogManager.getLogger(Construction. class);
	public static Calculate getPlan(String planType){  

      if(planType.equalsIgnoreCase("Standard")) {  
             return new Standard();  
           }   
       else if(planType.equalsIgnoreCase("AboveStandard")){  
            return new AboveStandard();  
        }   
      else if(planType.equalsIgnoreCase("HighStandard")) {  
            return new HighStandard();  
      }
      else if(planType.equalsIgnoreCase("HighStandardAutomatic")) {  
    	  return new HighStandardAutomatic();
      }
  return null;  
}  
}