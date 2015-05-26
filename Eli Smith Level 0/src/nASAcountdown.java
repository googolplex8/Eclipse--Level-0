import java.io.IOException;

public class nASAcountdown {
	public static void main(String[] args) throws InterruptedException,
			IOException {
		for (int i = 10; i >= 0; i--) {
			Runtime.getRuntime().exec("say t minus " + i).waitFor();
		}
		Runtime.getRuntime().exec("say Boom").waitFor();
	}
}
