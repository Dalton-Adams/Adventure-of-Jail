import java.util.Scanner;
import java.util.Random;

class Game {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	Intro();

	int choice1 = input.nextInt();
	switch (choice1) {
	 case 1:
	   System.out.println("You choose to peek out from your cell and look at your surroundings");
	   System.out.println("You see the other prisioners and only two or three gaurds it's hard to make out");
	   System.out.println("But you hear the unmistakeable sound of Bo Jang, your closest friend, then you pull in ypur head trying to see what you can do");
	break;
	 case 2:
	   System.out.println("You see the door and decide to run head first into it trying to break it down");
	   System.out.println("Unfortuanly the door didn't budge, but you did end up with a mouth full of blood and a cracked skull");
	break; }


	if (choice1 == 1)
          System.out.println("After looking outside your cell ideas of escape flood through your mind");
          System.out.println("You relize you must get out of this cell or bad things could happen");
          System.out.println("You look around your cell seeing what possible things you could use for escape");
          System.out.println("You find a rock that could maybe be use to beat someone over the head");
          System.out.println("You find a small long piece of metal, maybe it can be used as a shank or a lockpick");
	  System.out.println("Do you use the rock to fight or Do you use the metal to pick the lock?");
	  System.out.println("Type 1 for Rock or 2 for Metal");

	 int case1p2 = input.nextInt();
	switch (case1p2) {
	  case 1:
            System.out.println("You choose to lure the guards into your cell by crying out and pain");
            System.out.println("With the rock behind your back you prepare for battle, as two guards rush into your cell");
            System.out.println("You strike out surprising the first guard and he drops to the ground");
            System.out.println("As you turn to move and strike the second guard, he was prepared and with a quick movement he smackes you in the head");
            System.out.println("You drop to the ground, moments from blacking out, you feel them pick you up and hang you by chains to the wall");
            System.out.println("As you come to you relize there is no hope for escape your now trapped here forever");
            System.out.println("The end, Thank you for playing");
	 break;
	  case 2:
            System.out.println("You choose to pick the lock with the long piece of metal");
            System.out.println("You peek out of your cell waiting tell the guards turn their back, so you can get to work");
            System.out.println("As the guards turn their back to you, you start to pick the lock");
            System.out.println("You start slow feeling out the lock and carefully moving in a way to get the lock to give away");
            System.out.println("You finally find the correct placement and the door clicks softly the door is open");
	 break; }

      }
public static void Intro() {
	System.out.println("You awake in the world of Garyeha");
	System.out.println("You look around, dazed and confused, but you are sure your in a bad place.");
	System.out.println("The energy around you feels like death and is almost crushing you as, you take sharp deep breaths in trying to clear your head");
	System.out.println("You finnally see it your in the dungeon of the evil Lord Garth.");
        System.out.println("Do you peek out of your cell and check your surroundings or Do you run head first into the door?");
        System.out.println("Type 1 for Peek or 2 for Run head first");

}
}


