public class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage decoratedPage){
        super(decoratedPage);
    }
    public void AuthorizedUser(){
        System.out.println("Authorized user used this project");

    }

    public void display(){
        super.display();
        this.AuthorizedUser();
    }


}