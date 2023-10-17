import java.util.*;
class TV{
	int Channel,volume;
	boolean on;
	TV(int Channel,int volume,boolean on){
		if((Channel>40||Channel<1)||(volume>7||volume<1))
			System.out.println("Wrong info about Channel or volume");
		else{
			this.Channel=Channel;
			this.volume=volume;
			this.on=on;
		}
	}
	public void turnOn(){
		if(on==true)
			System.out.println("Tv is already in On state");
		else{
			on=true;
			System.out.println("Tv is switched On");
		}
	}
	public void turnOff(){
		if(on==false)
			System.out.println("Tv is already in Off state");
		else{
			on=false;
			System.out.println("Tv is switched Off");
		}
	}
	public void setChannel(int Channel){
		if(this.on==false)
			System.out.println("TV is not turned On");
		else if(this.Channel==Channel)
			System.out.println("Tv is already on "+Channel);
		else if(Channel>40||Channel<1)
			System.out.println("There is no "+Channel+" Channel");
		else{
			System.out.println("Tv is set to "+Channel);
			this.Channel=Channel;
		}
	}
	public void setvolume(int volume){
		if(this.on==false)
			System.out.println("TV is not turned On");
		else if(this.volume==volume)
			System.out.println("Tv is already on volume "+volume);
		else if(volume>7||volume<1)
			System.out.println("There is no "+volume+" volume");
		else{
			System.out.println("Tv is set to volume "+volume);
			this.volume=volume;
		}
	}
	public void channelup(){
		setChannel(this.Channel+1);
	}
	public void channeldown(){
		setChannel(this.Channel-1);
	}
	public void volumeup(){
		setvolume(this.volume+1);
	}
	public void volumedown(){
		setvolume(this.volume-1);
	}
}
class operate{
	public static void main(String args[]){
		TV t1=new TV(2,7,true);
		t1.setChannel(27);
		t1.volumeup();
		t1.channeldown();
		t1.turnOff();
		t1.channeldown();
		t1.turnOff();
	}
}
