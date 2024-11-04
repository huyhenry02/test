public class car {
    private int codeCar,vehicle;
    private double triGia;
    private String chuXe,moTa;
    public car(int vehicle, int codeCar, String chuXe, double triGia, String moTa) {
        this.codeCar = codeCar;
        this.vehicle = vehicle;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.moTa = moTa;
    }
    
    public car(){
    
    }
    
    public int getCodeCar() {
        return codeCar;
    }
    
    public void setCodeCar(int codeCar){
        this.codeCar = codeCar;
    }
    
    public int getVehicle(){
        return vehicle;
    }
    
    public void setVehicle(int vehicle){
        this.vehicle = vehicle;
    }
    
    public double getTriGia() {
        return triGia;
    }
    
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
    
    public String getChuXe() {
        return chuXe;
    }
    
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
    
    public String getMoTa() {
        return moTa;
    }
    
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    public double calculateThue(){
        double thue = 0;
        if (vehicle < 100){
            thue = triGia * 0.01;
        }
        if ( 100 < vehicle  && vehicle < 200){
            thue = triGia * 0.03;
        }
        
        if ( 200 < vehicle){
            thue = triGia * 0.05;
        }
        return thue;
    }
    
    public String toString() {
        return codeCar + "-"+chuXe + "-"+vehicle + "-"+triGia + "-"+moTa;
    }
    
    void inThue(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",codeCar,chuXe,vehicle,triGia,moTa,calculateThue());
    }
}
