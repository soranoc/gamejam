package affichage;

import java.io.IOException;


public class BacASable {
	public BacASable() {
	 try {
		new Ecran(-1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
