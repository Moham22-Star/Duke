package application;

public abstract class Gamescript extends Gameplayhandler {
private String result;
private double health;
private String choice;

/*choice oneA*/
public static String getR1a() {	
	 String result1a = ("You head towards the door and your barley able to see out of the transparent door and you were able to see some figure standing out of the door. Which looks like an ALEIN!!! "
			+ "You have a chance to try to get to the door open or you could go back towards the middle of the room and try to cause a distraction. "
			+ "What do you do? ");
	 return result1a;
}

public void setR1a(String result) {
	this.result = result;
}

/*oneA options*/
public static String getC2a() {
	String choice = ("Go towards the door to see if it will open");
	return choice;
}
public void setC2a(String choice) {
	this.choice = choice;
}



public static String getC2b() {
	String choice = ("Go to the middle of the room to create a distraction ");
	return choice;
}
public void setC2b(String choice) {
	this.choice = choice;
}





/*choice oneB*/
public static String getR1b() {
	String result1b = ("You start looking around the room to see if there is a way out. "
			+ "You try feeling around the walls and from start to finish completely around the room you find nothing except for a toilet and a sink. "
			+ "I guess you will have to try something else ");
	return result1b;
}

public void setR1b(String result) {
	this.result = result;
}

/*oneB options !!! Old choices !!!*/
public static String getC1a() {
	String choice = ("Go towards the door and Investigate");
	return choice;
}
public void setC1a(String choice) {
	this.choice = choice;
}



public static String getC1c() {
	String choice = ("Try to punch your way out");
	return choice;
}
public void setC1c(String choice) {
	this.choice = choice;
}





/*choice oneC*/
public static String getR1c() {
	String result1c = ("You go up to the door fists flying as you go up to the door you run right into it persisting to shock yourselves until your vision goes blurry. "
			+ "You fall to the ground and pass out. Sometime later you wake up on a mysterious bench which appears to be an operating table with WHATS THIS, ALEINS! "
			+ "You are strapped down to the table. You see the aliens in the distance, but they are not looking at you."
			+ " There is a little table in the distance with sharp tools and devices. What do you do? ");
	return result1c;
}	

public void setR1c(String result) {
	this.result = result;
}

/*oneC options*/
public static String getC3a() {
	String choice = ("Try to see if the straps are loose.");
	return choice;
}
public void setC3a(String choice) {
	this.choice = choice;
}



public static String getC3b() {
	String choice = ("Try to see what they want.");
	return choice;
}
public void setC3b(String choice) {
	this.choice = choice;
}



public static String getC3c() {
	String choice = ("Sit there and scream at the top of your lungs.");
	return choice;
}
public void setC3c(String choice) {
	this.choice = choice;
}

















/*health change*/
public static double getHealth() {
	double playerhealth = 0.9;
	
	return playerhealth;
}

public void setHealth(double health) {
	this.health = health;
}

























}
