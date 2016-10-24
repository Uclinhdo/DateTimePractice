
package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.text.DateFormatter;

/**
 * This utility class helps to use dates and times
 * more convenient with using new Java Date/Time.
 * @author linhdo, ldo@my.wctc.edu
 * @version 1.0
 */
public class DateUtilities {
    
    
    /**
     * This method takes local date and convert to string.
     * @param date
     * @throws IllegalArgumentException
     * @return date with ISO_LOCAL_DATE type
     */
    
    public String toString(LocalDate date) throws IllegalArgumentException{
        if(date == null){
            throw new IllegalArgumentException("Error: Date cannot be null!");
        }
        DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;
        return date.format(fmt);
    }
    
    /**
     * This method takes local date time and convert to string
     * @param datetime
     * @throws IllegalArgumentException
     * @return date time with ISO_LOCAL_DATE_TIME type
     */
    public String toString(LocalDateTime datetime) throws IllegalArgumentException{
        if(datetime == null){
            throw new IllegalArgumentException("Error: Date cannot be null");
        }
        DateTimeFormatter fmt1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        return datetime.format(fmt1);
    }
    /**
     * This method takes a string date and convert to LocalDate.
     * @param date will be changed into a LocalDate
     * @throws IllegalArgumentException
     * @return LocalDate in a specified format
     */
    
    
    public LocalDate currentDate(String date)throws IllegalArgumentException{
        if(date == null || date.isEmpty()){
            throw new IllegalArgumentException("Error: Date cannot be null or empty");
        }
        LocalDate dateString = null;
        try{
        DateTimeFormatter fm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        dateString = LocalDate.parse(date, fm);
        }catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return dateString;
    }
    /**
     * This method takes a string date time and convert to LocalDateTime.
     * @param datetime will be changed into a LocalDateTime
     * @throws IllegalArgumentException
     * @return LocalDateTime in a specified format
     */
    public LocalDateTime dateTime(String datetime){
        if(datetime == null || datetime.isEmpty()){
            throw new IllegalArgumentException("Error: Date & Time cannot be null or empty.");
        }
        LocalDateTime datetimeString = null;
        try{
        DateTimeFormatter fm = DateTimeFormatter.ofPattern(datetime, Locale.CANADA);
        datetimeString = LocalDateTime.parse(datetime, fm);
        }catch(IllegalArgumentException ex){
            
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return datetimeString;
    }
    
    
}
