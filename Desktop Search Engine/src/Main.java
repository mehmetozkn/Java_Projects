import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static ArrayList<String> ignoreList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program is starting...");
        int select;
        while (true){
            System.out.println("Press 1 to enter query.");
            System.out.println("Press 0 to exit.");
            System.out.print("Select : ");
            if(scanner.hasNextInt()){ // Girilen input sayi ise bu bloga girer.
                select = scanner.nextInt();
                scanner.nextLine();
                if(select == 1){
                    System.out.print("Query = ");
                    String query = scanner.nextLine();
                    Map<String, Integer> map = run(query);
                    Heap heap = new Heap(10);
                    // Heape, dosya adını ve queryinin o dosyaya ait ağaçta kaç defa geçtiğini eklemek için.
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        String result = entry.getKey() + "(" + entry.getValue() + ")";
                        heap.insert(result);
                    }
                    heap.sort(heap.heap);
                    heap.print();

                }else if(select == 0){
                    System.out.println("Exiting...");
                    return;
                }else{
                    System.out.println("Invalid Transaction, Try again.");
                }

            }else{ // Girilen islem sayi değil ise bu bloga girer.
                scanner.nextLine();
                System.out.println("Invalid Transaction, Try again.");
                System.out.println("");
                continue;
            }

        }

    }

    public static Map run(String query) throws IOException {

        Map<String, Integer> fileCountMap = new HashMap<>();
        BST tree1 = searchEngine("src/docs/cse22501.html");
        BST tree2 = searchEngine("src/docs/cse22502.html");
        BST tree3 = searchEngine("src/docs/cse22503.html");
        BST tree4 = searchEngine("src/docs/cse22504.html");
        BST tree5 = searchEngine("src/docs/cse22505.html");
        BST tree6 = searchEngine("src/docs/cse22506.html");
        BST tree7 = searchEngine("src/docs/cse22507.html");
        BST tree8 = searchEngine("src/docs/cse22508.html");
        BST tree9 = searchEngine("src/docs/cse22509.html");
        BST tree10 = searchEngine("src/docs/cse22510.html");

        // Queryi birden fazla kelime ise kelimeleri ayırmak için
        ArrayList<String> queryWords = new ArrayList<>();
        String[] line = query.split(" ");

        for (int i = 0; i < line.length; i++) {
            queryWords.add(line[i]);
        }

        // Queryinin ağacda kaç defa geçtiğini mape kaydetmek için.
        for (int i = 1; i <= 10; i++) {
            int count = 0;
            String fileName = "";
            for (String word : queryWords) {
                if (i == 1) {
                    count += tree1.search(word);
                    fileName = "cse22501";
                }
                if (i == 2) {
                    count += tree2.search(word);
                    fileName = "cse22502";
                }
                if (i == 3) {
                    count += tree3.search(word);
                    fileName = "cse22503";
                }
                if (i == 4) {
                    count += tree4.search(word);
                    fileName = "cse22504";
                }
                if (i == 5) {
                    count += tree5.search(word);
                    fileName = "cse22505";
                }
                if (i == 6) {
                    count += tree6.search(word);
                    fileName = "cse22506";
                }
                if (i == 7) {
                    count += tree7.search(word);
                    fileName = "cse22507";
                }
                if (i == 8) {
                    count += tree8.search(word);
                    fileName = "cse22508";
                }
                if (i == 9) {
                    count += tree9.search(word);
                    fileName = "cse22509";
                }
                if (i == 10) {
                    count += tree10.search(word);
                    fileName = "cse22510";
                }
            }
            fileCountMap.put(fileName, count);

        }
        return fileCountMap;
    }


    public static BST searchEngine(String filePath) throws IOException {

        ignoreFileRead("src/docs/ignoreList.txt");
        Scanner scanner = new Scanner(new File(filePath));
        Matcher matcher;
        BST tree = new BST();

        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.charAt(0) != '<') { // To avoid getting html tags.
                matcher = Pattern.compile("[a-zA-Z]+").matcher(word); // Regex expression to avoid things like semicolons.
                // To get words that match the regex expression and are not in the ignore list.
                if (matcher.find() && !ignoreList.contains(word)) {
                    tree.insert(word.toLowerCase());

                }

            }

        }
        return tree;
    }

    public static void ignoreFileRead(String filePath) throws FileNotFoundException {
        // Storing IgnoreList's Word in the ArrayList.
        Scanner reader = new Scanner(new File(filePath));

        while (reader.hasNext()) {
            String line = reader.nextLine();
            ignoreList.add(line);
        }

    }


}
