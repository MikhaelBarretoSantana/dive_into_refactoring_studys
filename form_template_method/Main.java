package form_template_method;

public class Main {

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
        return new ArticleMarkdown(this).view();
    }

    public String htmlView() {
        return new ArticleHtml(this).view();
    }
}

abstract class ArticleView {
    protected Article article;

    public ArticleView(Article article) {
        this.article = article;
    }

    protected abstract String tittle();

    protected abstract String intro();

    protected abstract String body();

    protected abstract String footer();

    public String view() {
        return tittle() + intro() + body() + footer();
    }
}

class ArticleMarkdown extends ArticleView {
    public ArticleMarkdown(Article article) {
        super(article);
    }

    @Override
    protected String tittle() {
        return "# " + article.getTitle() + "\n\n";
    }

    @Override
    protected String intro() {
        return "> " + article.getIntro() + "\n\n";
    }

    @Override
    protected String body() {
        return article.getBody() + "\n\n";
    }

    @Override
    protected String footer() {
        return "_Written by " + article.getAuthor() + " on " + article.getDate() + "_";
    }

}

class ArticleHtml extends ArticleView {

    public ArticleHtml(Article article) {
        super(article);
    }

    public String view() {
        return tittle() + intro() + body() + footer();
    }

    @Override
    protected String tittle() {
        return "<h2>" + article.getTitle() + "</h2>" + "\n";
    }

    @Override
    protected String intro() {
        return "<blockquote>" + article.getIntro() + "</blockquote>" + "\n";
    }

    @Override
    protected String body() {
        return "<p>" + article.getBody() + "</p>" + "\n";
    }

    @Override
    protected String footer() {
        return "<em>Written by " + article.getAuthor() + " on " + article.getDate() + "</em>";
    }

}