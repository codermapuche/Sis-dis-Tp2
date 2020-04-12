package Sistemas_distribuidos_y_Prog_paralela.Tp2;

/**
 * Hello world!
 *
 */
public class Peer 
{
	private int portClient = 5000;
	private int portServer = 5001;
    private String serverMaster[];
    private String myIp;
    
	public Peer (String serverMaster[],String myIp) {
		this.serverMaster=serverMaster;
		this.myIp=myIp;
	}
	
	
	public static void main( String[] args )
    	{
    		
			
    	}
}
