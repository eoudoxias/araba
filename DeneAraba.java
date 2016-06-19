// toString() metoduna sahip Araba sinifinin kullanimi 
    import java.io.*; 
public class DeneAraba { 
  
  public static void main(String[] args) { 
    PrintWriter ciktiAkimi =null; 
    String dosya = "oAraba.txt"; 
    try { ciktiAkimi = new PrintWriter (new FileOutputStream(dosya)); }
    catch (FileNotFoundException hata){ 
      System.out.print("ornekAraba.txt dosyasi "); 
      System.out.println("olustururken hata oldu"); 
    System.exit(0); } 
    
    Araba ferrari = new Araba("kirmizi",450,320); 
    Araba fiat = new Araba("beyaz",75,145); 
    Araba opel = new Araba("mavi",150,200); 
    
    ciktiAkimi.println("Ferrari ozellikleri "); 
    ciktiAkimi.println(ferrari.toString()); 
    ciktiAkimi.println();
    
    ciktiAkimi.println("Fiat ozellikleri"); 
    ciktiAkimi.println(fiat.toString()); 
    ciktiAkimi.println(); 
    
    ciktiAkimi.println("Opel ozellikleri");
    ciktiAkimi.println(opel.toString()); 
    ciktiAkimi.println(); 
    
    System.out.print("Araba ozellikleri ornekAraba.txt"); 
    System.out.println(" dosyasina yazildi."); 
    ciktiAkimi.close(); 
  } 
}