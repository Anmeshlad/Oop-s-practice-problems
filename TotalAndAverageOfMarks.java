package BasicDemos;

public class TotalAndAverageOfMarks {
	 int sub1,sub2,sub3,sub4,sub5,sub6,total,average,percentage;
	 
	
	 public void totalmarks(){
		total=sub1+sub2+sub3+sub4+sub5+sub6;
		total=65+55+87+57+78+61;
		System.out.println("Total marks : "+total);
	 }
	 
	 public void averagemarks() {
		 average=total/600;
		 average=403/6;
		 System.out.println("Average marks : "+average);
	 }
	 
	 public void totalpercentage() {
		 percentage=total/600*100;
		 percentage=total/600*100;
		 System.out.println("Percentage is : "+percentage);
	 }
	

	public static void main(String[] args) {
		TotalAndAverageOfMarks t1=new TotalAndAverageOfMarks();
		t1.totalmarks();
		t1.averagemarks();
		t1.totalpercentage();

	}

}
