package __20010310038_Kubilay_Karakaya;



public class _20010310038_SC {
	_20010310038_RAM ram=new _20010310038_RAM();

	public _20010310038_SC(_20010310038_RAM ramm) {
		
		this.ram=ramm;
		
	}
	public  void  START() throws InterruptedException {
		
	_20010310038_IR ır =new _20010310038_IR(ram);
	    
     for (int i = 0; i < 16; i++) {
    	 
        String binaryValue = String.format("%04d", Integer.parseInt(Integer.toBinaryString(i)));       
        
        ır.Decoder(i);
        Thread.sleep(1000);  
     } 
	}
}
