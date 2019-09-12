import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first time: ");
    int fTime = sc.nextInt();
    System.out.print("Please enter the second time: ");    
    int sTime = sc.nextInt();
    int hour = 0;
    int min = 0; 
    fTime = formatTime(fTime);
    sTime = formatTime(sTime);
    if (fTime <= sTime)
    {
      hour = (sTime - fTime) / 100;
      min = (sTime - fTime) % 100;
    }
    else
    {
      hour = (2360 - fTime + sTime) / 100;
      min = (2360 - fTime + sTime) % 100;
    }
    
    if (min >= 60)
      {
        hour++;
        min %= 60;
      }
      System.out.println(hour + " hours " + min + " minutes.");
  }

  public static int formatTime(int time)
  {
    if (time % 100 == 0)
    {
      time = (time / 100 - 1) * 100 + 60;
    }
    return time;
  }
}
