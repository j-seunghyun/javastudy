package practice1;

class MobilePhone {
  protected String number;

  public MobilePhone(String num){
    number = num;
  }
  public void answer(){
    System.out.println("Hi~from" + number);
      }
}

class SmartPhone extends MobilePhone{
  public String androidVer;
  static int number = 0;

  public SmartPhone(String num, String ver){
    super(num);
    androidVer = ver;
  }
  public void playApp(){
    System.out.println("App is running in " + androidVer);
  }
}
public class MobileSmartPhoneRef {
  public static void main(String [] args){
    SmartPhone ph1 = new SmartPhone("010-3931-5102", "ahea");
    MobilePhone ph2 = new SmartPhone("010-8932-5102", "Mom");

    ph1.answer();
    ph1.playApp();

    System.out.println();

    ph2.answer();
    System.out.println(ph1.androidVer);
    //ph2.playApp();
  }
}
