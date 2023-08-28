package myexceptions;

public class InvariantViolated extends Exception {

	private static final long serialVersionUID = -3505410462963729748L;

	public InvariantViolated() {
        super();
    }

    public InvariantViolated(String msg) {
        super(msg);
    }
}
