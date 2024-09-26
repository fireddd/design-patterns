package composite;

import java.util.List;

public class CompositeNode implements OperationList {

    String text;
    List<OperationList> operationLists;

    public CompositeNode(String text, List<OperationList> operationListList) {
        this.text = text;
        this.operationLists = operationListList;
    }

    @Override
    public String getText() {
        String childText = operationLists.stream()
                .map(OperationList::getText)
                .reduce("", (a, b) -> a + " " + b)
                .trim();

        return "Composite " + this.text + " " + childText + " " + " Composite " + "\n";
    }
}
