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
				System.out.println("客户端连接到9999端口");
				MessageSingleSocket messageSingleSocket = new MessageSingleSocket(msSocket);
				messageSingleSocket.start();
				MSManager.getMSManager().add(messageSingleSocket);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
