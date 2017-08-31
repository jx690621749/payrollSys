package gui;

import server.MessagePack;
import server.connectTask;

public class clientDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		connectTask cTask = new connectTask();
		MessagePack messagePack = new MessagePack(),resultPack = new MessagePack();
		messagePack.booleanResult.add(false);
		messagePack.orderType = "0000";
		cTask.setMessagePack(messagePack);
		resultPack = cTask.conntect();
		System.out.println("boolIndex1:"+resultPack.booleanResult.get(1));
		System.out.println("orderType:"+resultPack.orderType);
	}

}
