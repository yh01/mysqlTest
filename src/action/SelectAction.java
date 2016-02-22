package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.SelectDAO;

public class SelectAction extends ActionSupport{
	public String idse;
	public String password;
	public String add;
	public String myId;
	public String myPass;
	public String myAdd;

	public String execute(){
		SelectDAO dao = new SelectDAO();
		boolean res = dao.select(idse);

		myId = dao.getMyId();
		myPass = dao.getMyPass();
		myAdd = dao.getMyAdd();

		if(!res){
			myId = "NotFound";
			myPass = "NotFound";
			myAdd = "NotFound";
		}
		return SUCCESS;
	}

	public String getIdse() {
		return idse;
	}
	public void setIdse(String idse) {
		this.idse = idse;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getMyId() {
		return myId;
	}
	public void setMyId(String myId) {
		this.myId = myId;
	}
	public String getMyPass() {
		return myPass;
	}
	public void setMyPass(String myPass) {
		this.myPass = myPass;
	}
	public String getMyAdd() {
		return myAdd;
	}
	public void setMyAdd(String myAdd) {
		this.myAdd = myAdd;
	}
}
