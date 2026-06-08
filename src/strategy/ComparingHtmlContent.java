package strategy;

public class ComparingHtmlContent
        implements ComparingStrategy {

    @Override
    public boolean compare(String oldHtml,
                           String newHtml) {

        if (oldHtml.equals(newHtml)) {

            System.out.println(
                    "HTML content is identical"
            );

            return false;
        }

        System.out.println(
                "HTML content has been updated"
        );

        return true;
    }
}
