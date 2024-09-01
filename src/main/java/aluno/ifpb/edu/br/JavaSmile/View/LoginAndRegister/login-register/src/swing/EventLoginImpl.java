package swing;

public class EventLoginImpl implements EventLogin {
    @Override
    public void loginDone() {
        System.out.println("Login bem-sucedido!");
    }

    @Override
    public void logOut() {}
}
