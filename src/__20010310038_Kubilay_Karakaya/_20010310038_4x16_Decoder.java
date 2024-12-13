package __20010310038_Kubilay_Karakaya;



public class _20010310038_4x16_Decoder {
	_20010310038_RAM ram=new _20010310038_RAM();
	 

	public _20010310038_4x16_Decoder(_20010310038_RAM ramm)
	{
		this.ram=ramm;
		}
	public void Decoder(String sayac) {
		_20010310038_IR ır =new _20010310038_IR(ram);
		
		String a ="";
		String b ="";
		String c ="";
		String d ="";
		
		

        String x= sayac.substring(0, 1);
        String y= sayac.substring(1, 2);
        String z= sayac.substring(2, 3);
        String k= sayac.substring(3, 4);
		
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

         
         if(k.equals("1")) {
        	d="0";
         }
         else
        	 d="1";

         if(a.equals("1")&& b.equals("1")) {
        	 
        	  int ii =tablo0(z,k,c,d);
        	  ır.Decoder(ii);	
         }
         else if(a.equals("1") && y.equals("1")) {
        	 int ii =tablo1(z,k,c,d);
        	  ır.Decoder(ii);
        	 
         }
         else if(x.equals("1") && b.equals("1")) {
        	 int ii =tablo2(z,k,c,d);
        	  ır.Decoder(ii);
        	 
         }
         else if(x.equals("1") && y.equals("1")) {
        	 int ii =tablo3(z,k,c,d);
        	  ır.Decoder(ii);
         }
	} 
	public int tablo0(String z ,String k  ,String c , String d) {
		
		if(c.equals("1")&& d.equals("1")) {
			return 0;
		 }
		 else if(c.equals("1") && k.equals("1")) {
			 return 1;
			 
		 }
		 else if(z.equals("1") && d.equals("1")) {
			 return 2;
			 
		 }
		 else if(z.equals("1") && k.equals("1")) {
			 return 3;
		 }
		return -1;
		
		
	}
public int tablo1(String z ,String k  ,String c , String d) {
		
		if(c.equals("1")&& d.equals("1")) {
			return 4;
		 }
		 else if(c.equals("1") && k.equals("1")) {
			 return 5;
			 
		 }
		 else if(z.equals("1") && d.equals("1")) {
			 return 6;
			 
		 }
		 else if(z.equals("1") && k.equals("1")) {
			 return 7;
		 }
		return -1;
		
		
	}
public int tablo2(String z ,String k  ,String c , String d) {
	
	if(c.equals("1")&& d.equals("1")) {
		return 8;
	 }
	 else if(c.equals("1") && k.equals("1")) {
		 return 9;
		 
	 }
	 else if(z.equals("1") && d.equals("1")) {
		 return 10;
		 
	 }
	 else if(z.equals("1") && k.equals("1")) {
		 return 11;
	 }
	return -1;
	
	
}
public int tablo3(String z ,String k  ,String c , String d) {
	
	if(c.equals("1")&& d.equals("1")) {
		return 12;
	 }
	 else if(c.equals("1") && k.equals("1")) {
		 return 13;
		 
	 }
	 else if(z.equals("1") && d.equals("1")) {
		 return 14;
		 
	 }
	 else if(z.equals("1") && k.equals("1")) {
		 return 15;
	 }
	return -1;
	
	
}
		
}




