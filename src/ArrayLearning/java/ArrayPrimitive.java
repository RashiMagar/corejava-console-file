package ArrayLearning.java;

public class ArrayPrimitive {
public static void main(String args[]) {
	int[]rollNumber = new int [10];//Array
	for (int i=0;i<10;i++)
	{
		rollNumber[i]=i+100;
	}
	String[]names= new String[10];
	        names[0]="Rashi";
			names[1]="Nikita";
			names[2]="Viraj";
			names[3]="Sakshi";
			names[4]="Rutuja";
			names[5]="Vyankatesh";
			names[6]="Kishan";
			names[7]="Rushita";
			names[8]="Pallavi";
			names[9]="Guddi";
			
			
			String[]adress= new String[10];
			adress[0]="Pune";
		    adress[1]="Nashik";
			adress[2]="Nagar";
			adress[3]="Baramati";
			adress[4]="Sambhajinagar";
			adress[5]="Nagpur";
			adress[6]="Amaravati";
			adress[7]="Buldhana";
			adress[8]="Vashim";
			adress[9]="Beed";
			for(int i=0;i<10;i++)
			{
				System.out.println("RollNumber:"+rollNumber[i]+""+"Name:"+names[i]+"Adress:"+adress[i]);
				
			}
       }
}
