
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**Michael Reed
 * ReedLab
 * @author Michael Reed
 */
public class AgeCalculation {

    


    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1968, Month.FEBRUARY, 16);
        int numberOfYears = Period.between(birthDate, today).getYears();
        
        System.out.println("Todays date is: " + today);
        System.out.println("Your birthday is: " + birthDate);
        System.out.println("You are " + numberOfYears + " years old.");
    
   }

}
