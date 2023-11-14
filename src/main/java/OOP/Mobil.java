package OOP;

public class Mobil extends Kendaraan{
    private int numDoors;
    private boolean isConvertible;


    private String fuelType;

    public Mobil(String merek1, String model1, int tahun1, String tipeBahanBakar1, int numDoors, boolean isConvertible, String fuelType1){
        super(merek1, model1, tahun1, tipeBahanBakar1, fuelType1);
        this.numDoors=numDoors;
        this.isConvertible=isConvertible;
        this.fuelType=fuelType1;
    }

    @Override //
    public void displayInfo(){
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Pembuatan: " + tahun);
        System.out.println("Bahan Bakar: " + tipeBahanBakar);
        System.out.println("Numdoors: " + numDoors);
        System.out.println("isConvertible: " + isConvertible);
        System.out.println("FUll Type " + super.fuelType);

    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    public int getNumDoors() {
        return numDoors;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
    public boolean isConvertible() {
        return isConvertible;
    }

    public void setFuelType(String fuelType) {
        if (fuelType != null){
            this.fuelType = fuelType;
        }

    }
    public String getFuelType() {
        return fuelType;
    }





    public void displayInfoKendaraan(){
        displayInfo();
    }

    public void fullType(){
        System.out.println("Full Type di class Mobil" + super.fuelType);
    }
//    public void displayInfo(String merek1, String model1, int tahun1, String tipeBahanBakar1){
//        System.out.println("Merek Mobil: " + this.merek);
//        System.out.println("Model Mobil: " + this.model);
//        System.out.println("Tahun Pembuatan Mobil: " + this.tahun);
//        System.out.println("Bahan Bakar Mobil: " + this.tipeBahanBakar);


//    }
}
