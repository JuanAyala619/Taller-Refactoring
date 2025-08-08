package Number_Magic;
public class RPMGame{
	private static final int MAX_WINS = 3;
	//....
	public static int main(){
		//....
		if(p1.getWins()>=MAX_WINS || p2.getWins()>=MAX_WINS){
			gameWon = true;
			System.out.println("GAME WON");
		}
		//....
	}
	//....
}
