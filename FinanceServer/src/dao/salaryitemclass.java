package dao;

import java.io.Serializable;
import java.util.List;

public class salaryitemclass  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
    private String type;
    private String visible;
    private String caculate;
    private String order;
    private String addordelete;
    private String remark;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public String getCaculate() {
		return caculate;
	}

	public void setCaculate(String caculate) {
		this.caculate = caculate;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getAddordelete() {
		return addordelete;
	}

	public void setAddordelete(String addordelete) {
		this.addordelete = addordelete;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
    
}
