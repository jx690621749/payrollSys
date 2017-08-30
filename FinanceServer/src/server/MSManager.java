package server;

import java.util.Vector;

public class MSManager {

	private MSManager(){}
	private static final MSManager msm = new MSManager();
	Vector<MessageSingleSocket> vector = new Vector<MessageSingleSocket>();
	
	
	public static MSManager getMSManager(){
		return msm;	
	}
	
	public void add(MessageSingleSocket mss) {
		vector.add(mss);
	}
}
