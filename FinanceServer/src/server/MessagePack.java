package server;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.Serializable;
import java.util.Vector;
import dao.salaryitem;
import dao.salaryitemclass;


public class MessagePack implements Serializable {
    private static final long serialVersionUID = 1L;
    private String orderType;
    private Boolean isChanged = false;
    private Vector<String> strPack  = new Vector<String>();
    private Vector<Boolean> booleanResult = new Vector<Boolean>();
    private String taskType;
    private LinkedList<salaryitemclass>  salaryitemList= new LinkedList<salaryitemclass>();
    
    
    public LinkedList<salaryitemclass> getSalaryitemList() {
		return salaryitemList;
	}

	public void setSalaryitemList(LinkedList<salaryitemclass> salaryitemList) {
		this.salaryitemList = salaryitemList;
	}

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

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }


}