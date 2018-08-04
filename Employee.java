public class Employee {
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

public Employee(String name, String number, String date) throws InvalidEmployeeNumber{
    employeeName = name;
    hireDate = date;

    if(number.length() != 5) {
            throw new InvalidEmployeeNumber(number);
   }
    else if ((number.charAt(0) < '0' || number.charAt(0) > '9') ||
                    (number.charAt(1) < '0' || number.charAt(1) > '9') ||
                    (number.charAt(2) < '0' || number.charAt(2) > '9') ||
                    (number.charAt(3) != '-' )||
                    (number.charAt(4) < 'A') || 
                    		(number.charAt(4) > 'M'))
                    		
                    
           {
            
             throw new InvalidEmployeeNumber(number);
           }
    else {
                employeeNumber = number;
        }
}

public void setEmployeeName(String name) {
        employeeName = name;
}

public String getEmployeeName() {
        return employeeName;
}

public void setNumber(String number) {
          employeeNumber = number;
}

public String getEmployeeNumber() {
        return employeeNumber;
}
public void setHireDate(String date) {
        hireDate = date;
}

public String getHireData() {
        return hireDate;
}

public String toString() {
        return "\nName: " + employeeName + "\nEmployee Number: " + employeeNumber + "\nHire Date" + hireDate;
}
}



