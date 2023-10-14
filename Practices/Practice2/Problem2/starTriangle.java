package Problem2;

public class starTriangle {
	public int len = 0 ;
	public String star = "[*]";
	public String perStar = "";
	
	public starTriangle(int len) {
		this.len = len;
	}
	
	public String toString(){
		
		
		for(int i = 1; i <= len; i++) {
			for(int j = 1; j <= i; j++) {
				perStar += star;
			}
			perStar += "\n";
		}
		
		
		
		return this.perStar;
	}
} 
