package b_javacore.task38.task3804;

@Entity(name = "social", value = 12)
public class SocialUser extends User {

    private String socialId;

    public SocialUser(int id, String displayName, String email, String socialId) {
        super(id, displayName, email);
        this.socialId = socialId;
    }
}
