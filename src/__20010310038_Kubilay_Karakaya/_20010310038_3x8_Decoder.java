package __20010310038_Kubilay_Karakaya;

public class _20010310038_3x8_Decoder {
	 public String Decoder(String opcode) {
		 	String a ="";
			String b ="";
			String c ="";
	        String x= opcode.substring(0, 1); // en anlamlı bit 
	        String y= opcode.substring(1, 2);
	        String z= opcode.substring(2, 3);
   
	        if(x.equals("1")) {
	        	a="0";
	         }
	         else
	        	 a="1";
	         
	         if(y.equals("1")) {
	        	b="0";
	         }
	         else
	        	 b="1";

	         
	         if(z.equals("1")) {
	        	c="0";
	         }
	         else
	        	 c="1";
      
	         if(a.equals("1")&& b.equals("1")&& c.equals("1")) {
	        	 return "D0";
	         }
	         if(a.equals("1")&& b.equals("1")&& z.equals("1")) {
	        	 return "D1";
	         }
	         if(a.equals("1")&& y.equals("1")&& c.equals("1")) {
	        	 return "D2";
	         }
	         if(a.equals("1")&& y.equals("1")&& z.equals("1")) {
	        	 return "D3";
	         }
	         if(x.equals("1")&& b.equals("1")&& c.equals("1")) {
	        	 return "D4";
	         }
	         if(x.equals("1")&& b.equals("1")&& z.equals("1")) {
	        	 return "D5";
	         }
	         if(x.equals("1")&& y.equals("1")&& c.equals("1")) {
	        	 return "D6";
	         }
	         if(x.equals("1")&& y.equals("1")&& z.equals("1")) {
	        	 return "D7";
	         }
    
	        
	        return null;
	 }

}

