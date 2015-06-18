package affichage;

import java.io.IOException;


public class BacASable {
	public BacASable() {
	 try {
		new Ecran(-1);
	} catch (IOException e) {
		e.printStackTrace();
	}

	}
}
