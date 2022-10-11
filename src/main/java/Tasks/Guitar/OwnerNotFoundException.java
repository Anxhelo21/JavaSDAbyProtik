package Tasks.Guitar;

public class OwnerNotFoundException extends Throwable {
    public OwnerNotFoundException() {
        super("No owner found, please try again later!");
    }
}
