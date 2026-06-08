package strategy;
public class ComparingContentSize
        implements ComparingStrategy {

    @Override
    public boolean compare(String oldContent,
                           String newContent) {

        if (oldContent.length()
                == newContent.length()) {

            System.out.println(
                    "Content size is identical"
            );

            return false;
        }

        System.out.println(
                "Content size has changed"
        );

        return true;
    }
}


