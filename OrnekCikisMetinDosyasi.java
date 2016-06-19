// Metin dosyasi olusturulmasi örnek programi 
import java.io.*; 
import java.util.*; 
public class OrnekCikisMetinDosyasi 
{ 
  public static void main(String[] args) 
  { 
    PrintWriter ciktiAkimi = null; 
    String dosya = "ornek.txt"; 
    try 
    { 
      ciktiAkimi = new PrintWriter (new FileOutputStream(dosya)); 
    } 
    catch (FileNotFoundException hata) 
    { 
      System.out.println("ornek.txt dosyasi   olustururken hata oldu"); 
      System.exit(0); 
    } 
    System.out.print("Bir ornek cumle giriniz:"); 
    Scanner klavye = new Scanner(System.in); 
    String cumle = klavye.nextLine(); 
    ciktiAkimi.println("Klavyeden girdiginiz cumle: " + cumle); 
    ciktiAkimi.println("Dosyayi kapatabiliriz."); 
    ciktiAkimi.close(); 
    System.out.println("Girilen cumle ornek.txt dosyasina yazildi."); 
  } 
}   