/*
    SPICY RAMEN DISCORD BOT
    Author: Amir Montgomery
    Date: 3/1/2022
*/
package SpicyRamen;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class App 
{
    
    public static void main(String[] args) 
    {
        config config = new SpicyRamen.config();
        DiscordApi api = new DiscordApiBuilder().setToken(config.token).login().join();
        
        // Print bot invite link
        System.out.println("Invite me to a server: " + api.createBotInvite());

        // some message listeners
        api.addMessageCreateListener(new PingPong());
    }
}
