package AccessModifier.BooksAndAuthors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Authors extends ReadString{ //extends ReadString для доступа к HashMap
    String s = "";
    String d = "Сожалеем, книга не найдена";
    protected HashMap<String, List<String>> list; //protected для доступа к HashMap

    public Authors() {
        this.list = new HashMap<String, List<String>>();
    }

    public void addBooksAndAuthors(String bookName, String authorsName) {
        List<String> aName = new ArrayList<>();
        if (this.list.containsKey(bookName)) {
            aName = this.list.get(bookName);
        }
        aName.add(authorsName);
        this.list.put(bookName, aName);
    }

    public String get(String bookName){
        if (this.list.containsKey(bookName)) {
            s = ", Автор: " +
                    this.list.get(bookName);
            return s;
        } else return d;
    }
}
