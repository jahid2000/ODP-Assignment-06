public class Main {
    public static void main(String args[]) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthorizedWebPage(myPage);
        myPage = new AuthenticatedWebpage(myPage);
        myPage.display();
    }

}