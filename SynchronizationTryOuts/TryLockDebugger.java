public class TryLockDebugger {

	public static void main(String[] args) {
		Object O = new Object();
		synchronized (O) {
			System.out
					.println("Put a debugger point here. Check for the lock icon in eclipse");
		}

	}

}
