package Sistemas_distribuidos_y_Prog_paralela.Tp2;

import java.util.ArrayList;

public class Master {

	
	//Ip range 10.10.10.1-10.10.10.10 reserved for Servers
	private String[] serverMaster = {"10.10.10.1","10.10.10.2"};
	private String ipPeer;
	private Integer host=10;
	private ArrayList<String> nodes = new ArrayList<String>();
	
	private String incNode() {
		host++;
		return ("10.10.10." + Integer.toString(host));
	}
	
	//Creo peer y agrego a la lista de peers el nuevo
	private Peer createPeer() {
		ipPeer = incNode();
		Peer peer = new Peer(serverMaster, ipPeer);
		nodes.add(ipPeer);
		return peer;
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
