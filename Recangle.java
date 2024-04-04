package BasicDemos;

//Using 'this' keyword

public class Recangle {
       private int hight;
       private int width;
       
       Recangle(){
    	   hight=45;
    	   width=21;
       }
       
       private Recangle(int hight,int width) {
    	   width=this.hight;
    	  hight= this.width;
       }
       
       private void details() {
    	   System.out.println("The Hight is "+hight+ " & Width is "+width);
       }
       
		public static void main(String[] args) {
			Recangle rc = new Recangle();
			rc.details();

			Recangle rc2 = new Recangle(32, 12);
			rc2.details();

		}

}
