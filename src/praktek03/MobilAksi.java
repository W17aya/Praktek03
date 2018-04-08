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
                        System.out.println("Jenis :"+Ml.getJenisMobil());
                        Ml.throttle();
              ;
  }  
}
