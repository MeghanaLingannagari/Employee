public class ProductionWorker extends Employee {
	
	 public int day = 1; //this is public because you will use these variables later
		public int night = 2;
		private int shift;
		private double hourlyPayRate;

	public ProductionWorker(String name, String number, String date, int shift, double hourlyPayRate) {
			super(name, number, date);
			this.shift = shift;
			this.hourlyPayRate = hourlyPayRate;
		}

	public void setShift(int s){ //determine if the employee has a day or night shift by making an if/else statement
		if(s==1) { //day shift => 1
			shift = day;
		}
		else if(s==2) { //night shift => 2
			shift = night;
		}
		else
			shift = 0; //shift is invalid
	}

	public int getShift() {
		return shift;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}

	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	@Override
	public String toString() {
		/** if(shift == 1) {
			String shiftType = "Day Shift";
			return "Employee Name: " + name + "\n Employee Number: " + number 
			+ "\n Hire Date: " + date;
		}
		else if(shift == 2) {
			String shiftType = "Night Shift";
		return "Employee Name: " + name + "\n Employee Number: " + number 
				+ "\n Hire Date: " + date;
			}
		else
			return "Invalid shift"; **/
		String str; 
		String str2;
		
		str = super.toString(); // prints out the data for employee class
		
		if(shift == day) {
			str = "\nShift Type: Day";
		}
		else if(shift == night) {
			str += "\nShift Type: Night";
		}
		else 
			str += "\nShift: Invalid Shift";
		str2 = "\nHourly Py Rate: " + hourlyPayRate;
		
		return str + str2;
	}

}
