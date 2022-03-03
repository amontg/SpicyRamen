/*
    SPICY RAMEN DISCORD BOT
    Author: Amir Montgomery
    Date: 3/1/2022
*/
package SpicyRamen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class App 
{
    private static Logger logger = LogManager.getLogger(App.class);
    
    public static void main(String[] args) 
    {
        config config = new SpicyRamen.config();
        DiscordApi api = new DiscordApiBuilder().setToken(config.token).login().join();
        
            // Print bot invite link
        //System.out.println("Invite me to a server: " + api.createBotInvite());
        logger.info("Invite me to your server: " + api.createBotInvite());

            // some message listeners
        api.addMessageCreateListener(new PingPong());

            // log bot server joins and leaves
        api.addServerJoinListener(event -> logger.info("Joined server " + event.getServer().getName()));
        api.addServerLeaveListener(event -> logger.info("Left server " + event.getServer().getName()));
    }
}
