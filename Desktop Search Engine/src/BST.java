public class BST {

    private Node root;

    void insert(String data) {
        // Method of adding elements to the binary search tree.
        if (root == null) {
            root = new Node(data);
        } else {
            Node temp = root;
            while (temp != null) {
                if (data.compareTo(temp.data) > 0) {
                    if (temp.right == null) {
                        temp.right = new Node(data);
                        return;
                    }
                    temp = temp.right;

                } else if (data.compareTo(temp.data) < 0) {
                    if (temp.left == null) {
                        temp.left = new Node(data);
                        return;
                    }
                    temp = temp.left;
                } else {
                    temp.count++;
                    return;
                }
            }
        }
    }

    int search(String key) {
        // ağacte data arama fonksiyonu
        if (root == null) {
            return 0;
        }
        Node temp = root;
        while (temp != null) {
            if (temp.data.compareTo(key) > 0) {
                temp = temp.left;
            } else if (temp.data.compareTo(key) < 0) {
                temp = temp.right;
            } else {
                return temp.count;
            }
        }
        return 0;

    }


}
