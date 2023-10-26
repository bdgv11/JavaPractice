package OOP;
public class Programming {

    private String language;
    private boolean learningComplete = false;

    public Programming(String language) {
        this.language = language;
    }

    public void learningStatus() {
        if (learningComplete) {
            System.out.println("I have finished! I'm Mastered in " + language);
        } else {
            System.out.println("Rn I'm learning " + language);
        }
    }

    public void learningComplete() {
        learningComplete = true;
    }

}
