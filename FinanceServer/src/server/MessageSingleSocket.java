package server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MessageSingleSocket extends Thread{
	Socket socket;
	
	public MessageSingleSocket (Socket s){
		this.socket = s;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));  
            Object obj = is.readObject();
            MessagePack mp = (MessagePack)obj;
            String orderType = mp.getOrderType();
            System.out.println(orderType);
            switch(orderType){
            case "0000":
            	System.out.println("0000 on server.");
            	System.out.println(mp.getBooleanResult().size());
            	System.out.println("origion:"+mp.getBooleanResult().get(0));
            	mp.booleanResult.add(true);
            	mp.setOrderType("3332");
                os.writeObject(mp);  
                os.flush();
            	break;
            case "0001":        	

            }
            
            socket.close();
            System.out.println("socke closed¡£");


            
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        

	}
}
