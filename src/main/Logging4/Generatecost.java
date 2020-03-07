package Logging4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Generatecost {
	private static final Logger LOGGER = LogManager . getLogger(Generatecost. class);
	public double Cost(String name,double Sqrfoot)
	{
		Construction c = new Construction();
		Calculate p = c.getPlan(name);  
		p.getRate();
		double d=p.calculateBill(Sqrfoot);
		LOGGER . debug("The cost is :"+d );
		return d;
	}

}