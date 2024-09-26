package composite;

import java.util.List;
import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        OperationList leafNode = new LeafNode("abc");
        OperationList leafNode1 = new LeafNode("123");
        OperationList leafNode2 = new LeafNode("xyz");
        CompositeNode compositeNode = new CompositeNode("comp", List.of(leafNode1, leafNode2));
        System.out.println("compositeNode");
        System.out.println(compositeNode.getText());
        CompositeNode compositeNode1 = new CompositeNode("comp1", List.of(leafNode, compositeNode));
        System.out.println("compositeNode1");
        System.out.println(compositeNode1.getText());
    }
}
