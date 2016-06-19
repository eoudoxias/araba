class Araba { 
  private String renk; 
  private int beygirGucu;  
  private int hiz; 
  
  public Araba(String renk, int guc, int hiz) {                           
    this.renk = renk; 
    this.beygirGucu = guc;   
  this.hiz = hiz; } 
  
  public void setRenk(String renk)
  {
    this.renk = renk;
  }
  
  public void setBeygirGucu(int guc)
  {
    this.beygirGucu = guc;
  }
  
  public void setHiz(int hiz)
  {
    this.hiz = hiz;
  }
  public String toString() { 
    String ozellikler=""; 
    ozellikler += "Renk = " + this.renk + " \n"; 
    ozellikler += "Beygir Gucu = " + this.beygirGucu + " \n"; 
    ozellikler += "Hiz = " + this.hiz + " \n"; 
  return (ozellikler); }
  
  public boolean equals(Araba yeniAraba) { 
    boolean ayniAraba = false; 
    // Iki arabanin bütün özellikleri ayni ise 
    // bu iki araba birbirine esittir diyebiliriz. 
    if (yeniAraba.renk == this.renk) 
    if (yeniAraba.beygirGucu == this.beygirGucu) 
    if (yeniAraba.hiz == this.hiz) ayniAraba = true; 
  return ayniAraba; } }