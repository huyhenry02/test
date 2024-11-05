import java.util.Date;

public class Food {
    private String code;
    private String name;
    private double price;
    private Date start_date, end_date;
    
    public Food(String code, String name, double price, Date start_date, Date end_date) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.start_date = start_date;
        this.end_date = end_date;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public Date getStart_date() {
        return start_date;
    }
    
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
    
    public Date getEnd_date() {
        return end_date;
    }
    
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    
    public boolean checkDateValid(boolean check) {
        if (this.getStart_date().before(start_date) || this.getEnd_date().after(end_date)) {
            check = false;
        } else {
            System.out.println("End date > Start date");
        }
        return check;
    }
    
    public boolean checkNameValid(boolean check) {
        if (this.getName() == null || this.getName().isEmpty()) {
            check = false;
        } else {
            System.out.println("Name is empty");
        }
        return check;
    }
    
    public void checkEndData() {
        Date today = new Date();
        
    }
}
