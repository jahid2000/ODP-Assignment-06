public class AuthenticatedWebpage extends WebPageDecorator {
    public AuthenticatedWebpage(WebPage decoratedPage) {
        super(decoratedPage);
    }
    public void authenticateUser() {
        System.out.println("Authenticating user used this project");
    }
    public void display() {
        super.display();
        this.authenticateUser();
    }
}