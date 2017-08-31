package server;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.Vector;


public class MessagePack implements Serializable {
    private static final long serialVersionUID = 1L;
    public String orderType;
    public Boolean isChanged = false;
    public Vector<String> strPack  = new Vector<String>();
    public Vector<Boolean> booleanResult = new Vector<Boolean>();
    public String taskType;
    public String bondedInfo;
    public Boolean getIsChanged() {
		return isChanged;
	}

	public void setIsChanged(Boolean isChanged) {
		this.isChanged = isChanged;
	}

	public Vector<Integer> getIntPack() {
		return intPack;
	}

	public void setIntPack(Vector<Integer> intPack) {
		this.intPack = intPack;
	}

	public MessagePack(){}
    public Vector<Integer> intPack = new Vector<Integer>();
    

    public MessagePack(String ot) {
        this.orderType = ot;
    }

    public Boolean getChanged() {
        return isChanged;
    }

    public void setChanged(Boolean changed) {
        isChanged = changed;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    
    public void booleanAdd(Boolean b){
    	this.booleanResult.add(b);
    }
    

    public Vector<String> getStrPack() {
        return strPack;
    }

    public void setStrPack(Vector<String> strPack) {
        this.strPack = strPack;
    }

    public void addString(String str){
        this.strPack.add(str);
    }

    public Vector<Boolean> getBooleanResult() {
        return booleanResult;
    }

    public void setBooleanResult(Vector<Boolean> booleanResult) {
        this.booleanResult = booleanResult;
    }

    public String getTaskType() {
        return taskType;
    }

    public String getBondedInfo() {
		return bondedInfo;
	}

	public void setBondedInfo(String bondedInfo) {
		this.bondedInfo = bondedInfo;
	}

	public void setTaskType(String taskType) {
        this.taskType = taskType;
    }


}