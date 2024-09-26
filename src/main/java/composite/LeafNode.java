package composite;

public class LeafNode implements OperationList {

    String text;

    public LeafNode(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "leaf "+this.text+" leaf "+"\n";
    }
}
