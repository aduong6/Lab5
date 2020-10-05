package application;

public class DataManager{
	String Dtext="";
	DataManager(){
		
	}
	public String getHello(){
		return "Hello World";
		}
	public String getHowdy(){
		return "Howdy y'all";
		}
	public String getChineese(){
		return "Ni hau";
		}
	public void setText(String text){
		this.Dtext=text;
		}
	}
