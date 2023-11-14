package OOP;

public class MobilApps {


    public static void main(String[] args) {
      Mobil mobilBaru = new Mobil("Honda", "HRV",2023, "Bensin", 4, false, "sx");
      //mobilBaru.displayInfo();
      mobilBaru.merek="Toyota";
      mobilBaru.model="Alphard";
      mobilBaru.tahun=2022;
      mobilBaru.tipeBahanBakar="Solar";
      mobilBaru.getNumDoors();
      mobilBaru.isConvertible();
      mobilBaru.getFuelType();

      mobilBaru.setConvertible(true); //tujuan set setter getter buat dipanggil dikelas lain
      mobilBaru.setNumDoors(5);
      mobilBaru.setFuelType("coba");
      mobilBaru.setFuelType("XXS");

      mobilBaru.displayInfo();

      Mobil mobilBaru2 = new Mobil("Mitsubishi", "Pajero", 2022, "Bensin", 2,false, "ed");
      mobilBaru2.displayInfo();

    }




}