package Assignments;

public class Encapsulation {
		
		private String name = "";
		private int cardNumber = 396598744;
		int age = 34;
		
		public String getName() {
			if (name.length() > 0 )
				return "**" + name.substring(2);
			else
				return "";
		}
		
		public void setName (String newName) {
			if (newName == "Swara")
				name = "Swara Garg";
			else
				name = newName;
		}
		

}
