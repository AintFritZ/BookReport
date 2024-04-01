import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class AuthorDA {
    private HashMap<String, Author> authorMap;
    public AuthorDA() throws FileNotFoundException {
        authorMap = new HashMap<>();
        Scanner file = new Scanner(new FileReader("C:\\Users\\neu\\IdeaProjects\\HashMapActivity\\src\\Author.csv"));

        while(file.hasNextLine()) {
            String rawFile = file.nextLine();
            String[] rawFileArray = rawFile.split(",");

            Author author = new Author();
            author.setName(rawFileArray[0].trim());
            author.setBio(rawFileArray[1].trim());

            authorMap.put(author.getName(), author);
        }
    }
    public HashMap<String, Author> getAuthorMap(){
        return authorMap;
    }
}
