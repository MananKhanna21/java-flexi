abstract class LibraryItem {
    private String id;
    private String title;
    protected boolean isRes;

    public LibraryItem(String i, String t) {
        id = i;
        title = t;
        isRes = false;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void showDetails() {
        System.out.println(id + " " + title);
    }

    public abstract void processLoan();
}

class TextBook extends LibraryItem {
    public TextBook(String i, String t) {
        super(i, t);
    }

    public void processLoan() {
        if (!isRes) {
            isRes = true;
            System.out.println("Textbook '" + getTitle() + "' issued for 14 days.");
        } else {
            System.out.println("Error: '" + getTitle() + "' is already on loan.");
        }
    }
}

class ResearchPaper extends LibraryItem {
    public ResearchPaper(String i, String t) {
        super(i, t);
    }

    public void processLoan() {
        System.out.println("Generating secure PDF download link...");
    }
}

public class study4 {
    public static void main(String[] args) {
        LibraryItem l1 = new TextBook("B101", "Java Core");
        LibraryItem l2 = new ResearchPaper("R99", "AI Ethics");

        l1.processLoan();
        l1.processLoan();

        l2.processLoan();
    }
}