package strategy;
public class ComparingTextContent
        implements ComparingStrategy {

    @Override
    public boolean compare(String oldText,
                           String newText) {

        boolean sameText =
                oldText.equals(newText);

        if (sameText) {

            System.out.println(
                    "Both text contents are the same"
            );

            return false;
        }

        System.out.println(
                "Website text content changed"
        );

        return true;
    }
}