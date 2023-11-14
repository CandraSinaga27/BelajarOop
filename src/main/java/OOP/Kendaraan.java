package OOP;

class Kendaraan {
    String merek;
    String model;
    int tahun;
    String tipeBahanBakar;
    String fuelType;

    //konstruktor -> method yang pertama kali dipanggil saat pertama kali object dibuat (nama clas haru sama dengan nama konstruktornya)
    // cth class kendaraan
    Kendaraan(String merek1, String model1, int tahun1, String tipeBahanBakar1, String fuelType1){
        this.merek=merek1;
        this.model=model1;
        this.tahun=tahun1;
        this.tipeBahanBakar=tipeBahanBakar1;
        this.fuelType=fuelType1;
    }

    public void displayInfo(){
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Pembuatan: " + tahun);
        System.out.println("Bahan Bakar: " + tipeBahanBakar);
        System.out.println("Full Type" + fuelType);
    }

    public void fullType(){
        System.out.println("Full Type di Class Kendaraan" + this.fuelType);
    }
}
