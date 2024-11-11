public class UserInterface
{
    private SocialNetwork network;

    public UserInterface()
    {
        this.network = new SocialNetwork();
    }

    public void run()
    {
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");
        User dave = new User("Dave");

        network.addUser(alice);
        network.addUser(bob);
        network.addUser(charlie);
        network.addUser(dave);

        alice.addFriend(bob);
        alice.addFriend(charlie);
        bob.addFriend(dave);

        alice.createPost("Hello, this is Alice's first post!");
        bob.createPost("Hey, Bob here, I'm about to make some coffee.");
        charlie.createPost("Alice is lying. She has been making posts for weeks already. Don't trust her.");
        dave.createPost("My thoughts are not ment for Facebook. So I won't share them with you guys.");

        alice.getPosts().get(0).like();
        bob.getPosts().get(0).like();
        bob.getPosts().get(0).like();

        System.out.println("Posts from alice's friends: " + "\n------------------------------");
        network.showFriendsPosts(alice);
    }
}
