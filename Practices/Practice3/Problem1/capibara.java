package Problem1;

public class tiger extends Animal{
	
	public tiger() {
		super();
	}
	
	public tiger(String name){
		super(name);
	}
	
	public String chillTime() {
		return "2 hours";
	}
	
	public String waterTemperature(String temp) {
		if(temp.equals("Hot") || temp.equals("Warm")) {
			return "okay i pull up";
		}else {
			return "angry tiger";
		}
	}

	public String waterTemperature(int temp) {
		if(temp > 36 && temp < 60) {
			return "okay i pull up";
		}else {
			return "angry tiger";
		}
	}
	
    public String getName() {
        return super.name; 
    }
	
    public int getLegs() {
        return super.numOfLegs; 
    }
	
	
}
