package server;

import java.sql.SQLException;
public class MyServerSocket {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new ServerListener().start();
//		new DataSocketListener().start();
//		new FileSocketListener().start();
	}

}
