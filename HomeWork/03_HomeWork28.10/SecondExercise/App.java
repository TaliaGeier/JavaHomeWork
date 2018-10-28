import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SimpleTime GoToJohnBryce = new SimpleTime();
		SimpleTime Clock = new SimpleTime();
		Alarm alarm = new Alarm(GoToJohnBryce, true, false, 0);

		System.out.println("Enter Time!");
		System.out.print("HH:");
		Clock.setHour(scan.nextInt());
		System.out.print("MM:");
		Clock.setMinutes(scan.nextInt());
		System.out.print("SS:");
		Clock.setSeconds(scan.nextInt());
		System.out.println(Clock.toString());

		System.out.println("When do you need to go to John Bryce?");
		System.out.print("HH:");
		GoToJohnBryce.setHour(scan.nextInt());
		System.out.print("MM:");
		GoToJohnBryce.setMinutes(scan.nextInt());
		System.out.print("SS:");
		GoToJohnBryce.setSeconds(scan.nextInt());

		while (Clock.equals(GoToJohnBryce)) {
			alarm.StartAlarm();
			break;
		}
		
		
		
		showMenu();
		
		int s = scan.nextInt();
		while (s != 0) {
		
		
			
			switch (s) {
			case 1:
				System.out.println("How Many Hours to ADD?");
				Clock.addHour(scan.nextInt());

				break;

			case 2:
				System.out.println("How Many Minutes to ADD?");
				Clock.addMin(scan.nextInt());
				break;

			case 3:
				System.out.println("How Many Seconds to ADD?");
				Clock.addSec(scan.nextInt());
				break;

			case 4:
				System.out.println(Clock.toString());
				break;

			case 5:
				Clock.tick();

				break;

			default:
				System.out.println("enter value from above!");
				showMenu();
				s = scan.nextInt();
				break;
			}

			showMenu();
			while (Clock.equals(GoToJohnBryce)) {
				alarm.StartAlarm();
				break;
			}
			s = scan.nextInt();

		}

		scan.close();
		System.out.println("Bye bye :) ");
		
		
	}

	public static void showMenu() {
		
		System.out.println("Okay! Whats next ?");
		System.out.println("Enter 0 to exit:");
		System.out.println("Enter 1 to add Hours: ");
		System.out.println("Enter 2 to add Minutes: ");
		System.out.println("Enter 3 to add Seconds: ");
		System.out.println("Enter 4 to show Time!");
		System.out.println("Enter 5 to TICK!");
		System.out.println("------------------");
	}

}
