package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener extends Thread {
	
	@Override
	public void run() {
		super.run();
		try {
			ServerSocket messageSocket = new ServerSocket(9998);
			while(true){
				Socket msSocket = messageSocket.accept();
				System.out.println("�ͻ������ӵ�9999�˿�");
				MessageSingleSocket messageSingleSocket = new MessageSingleSocket(msSocket);
				messageSingleSocket.start();
				MSManager.getMSManager().add(messageSingleSocket);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
