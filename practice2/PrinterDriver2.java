package practice2;

/* 다중 상속 테스트
 * 1. interface의 경우에 하나의 interface로 다중 클래스에 상속해주어 
 * 연결점 역할을 한다. 
 * class의 경우에는 하나의 클래스가 여러개의 클래스에게 상속을 해줄 수 있는가?
 */

interface printable{
  public int prnnum = 0;
}

interface notPrintable{

}

class Lprint implements printable, notPrintable{

  public Lprint(int isbn){
    super(isbn);
    System.out.println("print in Lprint");
  }
}



public class PrinterDriver2 {
  public static void main(String [] args){

    Sprint s1 = new Sprint(5);
    Lprint l1 = new Lprint(10);
  }
}
