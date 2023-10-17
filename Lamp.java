import java.util.*;
class Lamp{
	boolean isOn;
	String lamp;
	Lamp(boolean isOn,String lamp){
		this.isOn= isOn;
		this.lamp=lamp;
	}
	public void turnOn(){
		if(isOn==true)
		System.out.println(lamp+" is already in On State");
		else{
			System.out.println(lamp+" is switched On");
			isOn=true;
		}
	}
	public void turnOff(){
		if(isOn==false)
		System.out.println(lamp+" is already in Off State");
		else{
			System.out.println(lamp+" is switched Off");
			isOn=false;
		}
	}
}
class OnOff{
	public static void main(String args[]){
		Lamp led=new Lamp(true,"Led");
		Lamp halogen=new Lamp(false,"Halogen");
		led.turnOn();
		led.turnOff();
		halogen.turnOn();
		halogen.turnOff();
	}
}
