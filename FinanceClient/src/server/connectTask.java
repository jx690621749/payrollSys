package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class connectTask {
	private MessagePack messagePack = null;
	String IP = "10.10.88.38";
	public MessagePack conntect() {

		  try{

			Socket socket = new Socket(IP,9998);
		    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//		    MessagePack messagePack = new MessagePack();
		    messagePack.orderType = "0000";
		    oos.writeObject(messagePack);
		    System.out.println("orderType writeBack:"+messagePack.getOrderType());
		    oos.flush();
		//  --------------------------
		    Object obj = ois.readObject();
		    System.out.println("obj:"+obj);
		    MessagePack mp;
		    mp = (MessagePack) obj;
		    System.out.println("orderType writeBack:"+mp.getOrderType());
		    //µÃµ½MassagePack
		    oos.close();
		    ois.close();
		    return mp;
		  }catch(IOException | ClassNotFoundException e){
				System.out.println("IO sendsocket"+e.getMessage());
				messagePack.setBondedInfo("connection down.");
				return messagePack;
			}

	}
	public MessagePack getMessagePack() {
		return messagePack;
	}
	public void setMessagePack(MessagePack messagePack) {
		this.messagePack = messagePack;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
}

