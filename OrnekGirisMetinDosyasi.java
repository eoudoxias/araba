 // Metin dosyasi giris örnegi
import java.io.*;
public class OrnekGirisMetinDosyasi
{
  public static void main(String[] args){
    try
    {
      BufferedReader girisAkimi =
      new BufferedReader(new FileReader("ornek.txt"));
      String satir = null;
      satir = girisAkimi.readLine( );
      System.out.print("ornek.txt dosyasinin 1. satirinda:");
      System.out.println("\n" + satir +" yazmaktadir. ");
      satir = girisAkimi.readLine( );
      System.out.print("ornek.txt dosyasinin 2. satirinda:"); 
      System.out.println("\n" + satir + "yazmaktadir."); 
      girisAkimi.close( );
    }
    catch(FileNotFoundException e)
    {
      System.out.print("ornek.txt dosyasi bulunamadi");
      System.out.println("veya acilamadi.");
    }
    catch(IOException e)
    {
      System.out.print("ornek.txt dosyasindan veri girisinde");
      System.out.println(" hata olustu.");
    }
  }
}
  