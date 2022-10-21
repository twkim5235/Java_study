package ch7;

import java.io.IOException;

class Tv {

  private boolean power; // 전원 상태(on/off)
  private int channel; // 채널

  public void power() {
    power = !power;
  }

  public void upChannel() {
    ++channel;
  }

  public void downChannel() {
    --channel;
  }

  public int getChannel() {
    return this.channel;
  }

  Tv(int channel) {
    this.channel = channel;
  }
}

class CaptionTv extends Tv {

  boolean caption; // 캡션 상태(on/off)

  CaptionTv(){
    super(0);
  }

  CaptionTv(int channel) {
    super(channel);
  }

  void displayCaption(String text) {
    if (caption) { // 캡션 상태가 on(true)일 때만 text를 보여준다.
      System.out.println(text);
    }
  }
}

public class CaptionTvTest {

  public static void main(String[] args) {
    CaptionTv ctv = new CaptionTv(5);
    ctv.power();
    ctv.upChannel();
    System.out.println(ctv.getChannel()); //6

    ctv.displayCaption("Hello, World"); //아무것도 출력 안됨
    ctv.caption = true; // 캡션(자막) 기능을 킨다.
    ctv.displayCaption("Hello, World");
  }
}
