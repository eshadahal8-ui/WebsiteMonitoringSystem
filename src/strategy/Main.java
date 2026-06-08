package strategy;

public class Main {

    public static void main(String[] args) {

        String oldWebsite =
                "<html>Hello World</html>";

        String newWebsite =
                "<html>Hello Java</html>";

        UpdateChecker checker =
                new UpdateChecker();

        // Compare content size
        checker.setStrategy(
                new ComparingContentSize()
        );

        checker.checkWebsite(
                oldWebsite,
                newWebsite
        );

        // Compare html content
        checker.setStrategy(
                new ComparingHtmlContent()
        );

        checker.checkWebsite(
                oldWebsite,
                newWebsite
        );

        // Compare text content
        checker.setStrategy(
                new ComparingTextContent()
        );

        checker.checkWebsite(
                oldWebsite,
                newWebsite
        );
    }
}