 //Döngü kullanarak giris yapilan bir metin dosyasi örnegi
import java.io.*;
public class OrnekGirisMetinDosyasiw
{
  public static void main(String[] args){
    try
    {
      BufferedReader girisAkimi =
      new BufferedReader(new FileReader("ornek.txt"));
      String satir = null;
      int sayac = 0;
      satir = girisAkimi.readLine( );
      while (satir != null)
      {
        sayac++;
        System.out.print("ornek.txt dosyasinin " + sayac);
        System.out.print(". satirinda:" );
        System.out.println(satir + "yazmaktadir. ");
        satir = girisAkimi.readLine( );
      }
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
