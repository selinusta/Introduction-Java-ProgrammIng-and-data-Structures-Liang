package bolum03;

public class IfSwitchRewrite {

	public static void main(String[] args) {
		int x = 1, a = 3;
		if (a == 1)
			x += 5;
		else if (a == 2)
			x += 10;
		else if (a == 3)
			x += 16;
		else if (a == 4)
			x += 34;

		switch (a) {
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;
		case 4:
			x += 34;
			break;
		}

		switch (a) {
		case 4:
			x += 18;
		case 3:
			x += 6;
		case 2:
			x += 5;
		case 1:
			x += 5;
		}
	}

}
