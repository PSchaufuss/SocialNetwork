import java.util.ArrayList;

public class User
{
    private String username;
    private ArrayList<User> friends;
    private ArrayList<Post> posts;

    public User(String username)
    {
        this.username = username;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getUsername()
    {
        return username;
    }

    public void addFriend(User user)
    {
        if (!friends.contains(user))
        {
            friends.add(user);
        }
    }

    public void createPost(String content)
    {
        Post newPost = new Post(content, this);
        posts.add(newPost);
    }

    public ArrayList<User> getFriends()
    {
        return friends;
    }

    public ArrayList<Post> getPosts()
    {
        return posts;
    }
}
