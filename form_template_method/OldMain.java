package form_template_method;

public class OldMain {

}

class Article {
    public String getTitle() {

    }

    public String getIntro() {

    }

    public String getBody() {

    }

    public String getAuthor() {

    }

    public String getDate() {

    }

    public String markdownView() {
        String output = "# " + getTitle() + "\n\n";
        output += "> " + getIntro() + "\n\n";
        output += getBody() + "\n\n";
        output += "_Written by " + getAuthor() + " on " + getDate() + "_";
        return output;
    }

    public String htmlView() {
        String ouput = "<h2>" + getTitle() + "</h2>" + "\n";
        ouput += "<blockquote>" + getIntro() + "</blockquote>" + "\n";
        ouput += "<p>" + getBody() + "</p>" + "\n";
        ouput += "<em>Written by " + getAuthor() + " on " + getDate() + "</em>";
        return ouput;
    }
}