import java.util.Scanner;

class BankCustomer
{
String name;
int accountNumber;
double balance;

// Constructor
public BankCustomer(String name, int accountNumber, double balance)
{
this.name = name;
this.accountNumber = accountNumber;
this.balance = balance;
}


// Deposit money
public void deposit(double amount)
{
balance += amount;
System.out.println("Deposit successful. Current balance: " + balance);
}

// Withdraw money
public void withdraw(double amount)
{
if (balance >= amount)
{
balance -= amount;
System.out.println("Withdrawal successful. Current balance: " +
balance);
}
else
{
System.out.println("Insufficient funds. Withdrawal failed.");
}
}

// Calculate and add interest
public void addInterest(double rate)
{
double interest = balance * rate / 100;
balance += interest;
System.out.println("Interest added. Current balance: " + balance);
}


}

class BankEmployee
{
int employeeId;
String name;
String position;

// Constructor
public BankEmployee(int employeeId, String name, String position)
{
this.employeeId = employeeId;
this.name = name;
this.position = position;
}
}

class BankAdmin
{
// View customer profile
public void viewCustomerProfile(BankCustomer customer)
{
System.out.println("Customer Profile - Name: " + custom name +",
Account Number: " + customer.accountNumber + ", Balance: " +
customer.balance);
}

// View employee profile
public void viewEmployeeProfile(BankEmployee employee)
{
System.out.println("Employee Profile - Name: " + employee.name +

", Employee ID: " + employee.employeeId + ", Position: " +
employee.position);
}
}

public class BankManagementSystem
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);

// Customer registration
System.out.println("Customer Registration");
System.out.print("Enter your name: ");
String customerName = scanner.nextLine();
System.out.print("Enter your account number: ");
int accountNumber = scanner.nextInt();
System.out.print("Enter initial balance: ");
double initialBalance = scanner.nextDouble();

BankCustomer customer = new BankCustomer(customerName,
accountNumber, initialBalance);

// Employee login
System.out.println("\nEmployee Login");
System.out.print("Enter employee ID: ");
int employeeId = scanner.nextInt();
scanner.nextLine(); // Consume the newline
System.out.print("Enter employee name: ");
String employeeName = scanner.nextLine();
System.out.print("Enter employee position: ");
String employeePosition = scanner.nextLine();

BankEmployee employee = new BankEmployee(employeeId,
employeeName, employeePosition);

// Admin login
BankAdmin admin = new BankAdmin();

// Customer operations
System.out.println("\nCustomer Operations");
System.out.print("Enter deposit amount: ");
double depositAmount = scanner.nextDouble();
customer.deposit(depositAmount);

System.out.print("Enter withdrawal amount: ");
double withdrawalAmount = scanner.nextDouble();
customer.withdraw(withdrawalAmount);

// Interest calculation
System.out.print("Enter interest rate: ");
double interestRate = scanner.nextDouble();
customer.addInterest(interestRate);

// Admin view profiles
System.out.println("\nAdmin View Profiles");
admin.viewCustomerProfile(customer);
admin.viewEmployeeProfile(employee);

scanner.close();
}
}