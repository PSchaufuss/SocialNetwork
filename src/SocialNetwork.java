import java.util.ArrayList;

public class SocialNetwork
{
    private ArrayList<User> users;

    public SocialNetwork()
    {
        this.users = new ArrayList<>();
    }

    public void addUser(User user)
    {
        if (!users.contains(user))
        {
            users.add(user);
        }
    }

    public void showFriendsPosts(User user)
    {
        for (User friend : user.getFriends())
        {
            for (Post post : friend.getPosts())
            {
                post.printPost();
                System.out.println("------------------------------");
            }
        }
    }
}
