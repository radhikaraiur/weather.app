import Facebook4j.Facebook;
import Facebook4j.FacebookException;
import Facebook4j.FacebookFactory;
import Facebook4j.auth.AccessToken;

public class FacebookExample {
    public static void main(String[] args) {
        // Create a new Facebook instance
        Facebook facebook = new FacebookFactory().getInstance();

        // Set your Facebook App ID and App Secret
        String appId = "YOUR_APP_ID";
        String appSecret = "YOUR_APP_SECRET";

        // Set your access token
        String accessTokenString = "YOUR_ACCESS_TOKEN";
        AccessToken accessToken = new AccessToken(accessTokenString);

        // Set the access token to the Facebook instance
        facebook.setOAuthAppId(appId, appSecret);
        facebook.setOAuthAccessToken(accessToken);

        // Post a message to Facebook
        try {
            facebook.postStatusMessage("Hello, Facebook!");
            System.out.println("Message posted successfully!");
        } catch (FacebookException e) {
            e.printStackTrace();
        }
    }
}
