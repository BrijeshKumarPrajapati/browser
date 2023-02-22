
import java.util.*;

public class BrowserHistory {
	private String currentPage;
	private List<String> history = new ArrayList<>();
	
 
	public BrowserHistory(String homepage) {
		currentPage = homepage;
		history.add(homepage);
		history.add("facebook.com");
		history.add("www.abcd.com");
		history.add("www.bcdef.in");
		System.out.println(history);
	}

	public class InvalidURLException extends Exception {
		public InvalidURLException(String message) {
			super(message);
		}
	}

	public class NoHistoryFoundException extends Exception {
		public NoHistoryFoundException(String message) {
			super(message);
		}
	}

	public class InvalidPositionException extends Exception {
		public InvalidPositionException(String message) {
			super(message);
		}
	}

	public void visit(String url) throws InvalidURLException {

		if (url.endsWith(".com") || url.endsWith(".in") || url.endsWith(".org")) {

			currentPage = url;
			history.add(currentPage);
			System.out.println(history);
		} else {
			throw new InvalidURLException("Invalid url extension");
		}
	}

	public String back(int steps) throws NoHistoryFoundException {
		
		int backSteps = Math.min(steps, history.indexOf(currentPage));
		if (backSteps != 0) {
			int newCurrentIndex = history.indexOf(currentPage) - backSteps;
			currentPage = history.get(newCurrentIndex);
			return currentPage;
		} else {
			throw new NoHistoryFoundException("No History Found");
		}

	}

	public String forward(int steps) throws NoHistoryFoundException {
		int forwardSteps = Math.min(steps, history.size() - history.indexOf(currentPage) - 1);
		if (forwardSteps != 0) {
			int newCurrentIndex = history.indexOf(currentPage) + forwardSteps;
			currentPage = history.get(newCurrentIndex);
			return currentPage;
		} else {
			throw new NoHistoryFoundException("No History Found");
		}
	}

	public String get(int position) throws IndexOutOfBoundsException, InvalidPositionException {
		if (position < 0) {
			throw new InvalidPositionException("Provide only positive values");
		} else {
			return history.get(position);
		}
	}

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the homepage url: ");
		String homepage = input.nextLine();

		BrowserHistory browserHistory = new BrowserHistory(homepage);

		while (true) {
			System.out.print("Enter action (visit/back/forward/get/exit): ");
			String action = input.nextLine();

			if (action.equalsIgnoreCase("exit")) {
				System.out.println("Closing the browser");
				break;

			} else if (action.equalsIgnoreCase("visit")) {

				System.out.print("Enter url: ");
				String url = input.nextLine();

				try {
					browserHistory.visit(url);
					System.out.println("Current url: " + browserHistory.currentPage);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else if (action.equalsIgnoreCase("back")) {

				System.out.print("Enter steps: ");
				String backSteps = input.nextLine();

				try {
					String backUrl = browserHistory.back(Integer.parseInt(backSteps));
					System.out.println("Current url: " + backUrl);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else if (action.equalsIgnoreCase("forward")) {
				System.out.print("Enter steps: ");
				String forwardSteps = input.nextLine();

				try {
					String forwardUrl = browserHistory.forward(Integer.parseInt(forwardSteps));
					System.out.println("Current url: " + forwardUrl);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else if (action.equalsIgnoreCase("get")) {

				System.out.print("Enter position: ");
				String position = input.nextLine();
				try {
					String urlAtPosition = browserHistory.get(Integer.parseInt(position));
					System.out.println("Url at position " + position + ": " + urlAtPosition);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else {
				System.out.println("Invalid Choice");
			}

		}
	}
}
