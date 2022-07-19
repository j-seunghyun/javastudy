package practice2;

interface Printable{
  public void print(String doc);
}

class SprinterDriver implements Printable{
  @Override
  public void print(String doc){
    System.out.println("From samsung");
  }
}

class LprinterDriver implements Printable{
  @Override
  public void print(String doc){
    System.out.println("From LG");
  }
}
public class PrinterDriver {
  public static void main(String[] args){
    
  }
}
