package strategy;

public class UpdateChecker {

    private ComparingStrategy strategy;

    public void setStrategy(
            ComparingStrategy strategy) {

        this.strategy = strategy;
    }

    public void checkWebsite(String oldData,
                             String newData) {

        strategy.compare(oldData,
                newData);
    }
}
