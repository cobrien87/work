import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class CheckingAccount{
  private int balance, withdrawal, deposit;
  private String name, date, ssn;

  //for accessing today's date
  private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/uuuu");
  private LocalDate localDate = LocalDate.now();

  public CheckingAccount(String my_name, String my_ssn){
    //sets date to today's date
    date = dtf.format(localDate);
    //initialize name and ssn with parameters:
    name = my_name;
    ssn = my_ssn;
    //initialize balance, withdrawal, deposit at 0:
    balance = 0;
    withdrawal = 0;
    deposit = 0;

  }
  public void printDate(){
    System.out.print(date);
  }
}
