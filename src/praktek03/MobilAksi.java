package praktek03;

public class MobilAksi {
  public static void main(String[] args){
      Mobil l = new Mobil();
      l.setMerk("Lamborghini");
      l.setWarna("Merah");
      l.setHarga(600000);
      
      
      
      l.cetakinfo();
      
      System.out.print("merknya \t: ");
      System.out.println(l.getMerk());
       System.out.print("Warnanya \t: ");
              System.out.println(l.getWarna());
               System.out.print("Harganya \t: ");
                      System.out.println(l.getHarga());
                    
                        MobilListrik Ml = new MobilListrik();
                        Ml.setMerk("Tesla");
                        Ml.setWarna("Biru");
                        Ml.setHarga(700000);
                        Ml.setJenisMobil("Listrik");
                        Ml.cetakinfo();
                        System.out.println("Jenis   : "+Ml.getJenisMobil());
                        Ml.throttle();
              
                        
                        MobilSport S1 = new MobilSport();
                        S1.setMerk("Buggati Veyron");
                        S1.setWarna("Kuning Emas");
                        S1.setHarga(1000000);
                        S1.setJenisMobil("Sport");
                        S1.cetakinfo();
                        System.out.println("Jenis   : "+S1.getJenisMobil());
                        S1.throttle();
                        
                        MobilAPV A1 = new MobilAPV();
                        A1.setMerk("Karimun Wagon");
                        A1.setWarna("Pink");
                        A1.setHarga(300000);
                        A1.setJenisMobil("Mobil All Purpose Vehicle");
                        A1.cetakinfo();
                        System.out.println("Jenis   : "+A1.getJenisMobil());
                        A1.throttle();
  }  
}
