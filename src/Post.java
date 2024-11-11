public class Post
{
    private String content;
    private User author;
    private int likes;

    public Post(String content, User author)
    {
        this.content = content;
        this.author = author;
        this.likes = 0;
    }

    public void like()
    {
        likes++;
    }

    public void printPost()
    {
        System.out.println("Post: " + content);
        System.out.println("Author: " + author.getUsername());
        System.out.println("Likes: " + likes);
    }

    public User getAuthor()
    {
        return author;
    }
}
