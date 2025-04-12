package Assignment_6;



class Country {
    String name;
    int population;

    Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    // Override toString for readable output
    public String toString() {
        return name + " (" + population + ")";
    }
}

class BNode {
    Country data;
    BNode left, right;

    BNode(Country data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Q4 {
    BNode root;

    void insert(Country country) {
        BNode temp = new BNode(country);
        BNode current = root, parent = null;

        if (root == null) {
            root = temp;
            return;
        }

        while (current != null) {
            parent = current;
            if (country.population < current.data.population) {
                current = current.left;
            } else if (country.population > current.data.population) {
                current = current.right;
            } else {
                // If population is equal, do not insert (or handle duplicates here)
                return;
            }
        }

        if (country.population < parent.data.population) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
    }

    void inOrder(BNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    Country findmax() {
    	if(root == null) return null;
    	BNode current = root;
    	while(current.right != null) current = current.right;
    	return current.data;
    	
    }

    public static void main(String[] args) {
        Q4 bst = new Q4();

        // Insert sample countries
        bst.insert(new Country("India", 1400000000));
        bst.insert(new Country("USA", 331000000));
        bst.insert(new Country("China", 1440000000));
        bst.insert(new Country("Brazil", 213000000));
        bst.insert(new Country("Pakistan", 225000000));

        System.out.println("In-order traversal:");
        bst.inOrder(bst.root);

        System.out.println("\nRoot of the binar¥search tree: " + bst.root.data);
        
        System.out.println(bst.findmax());
    }
}



