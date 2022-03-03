package SpicyRamen;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class PingPong implements MessageCreateListener
{

    @Override
    public void onMessageCreate(MessageCreateEvent event) 
    {
        // check if a user says .ping
        if (event.getMessageContent().equalsIgnoreCase(".ping"))
        {
            event.getChannel().sendMessage("Please shut up.");
        }

    }
    
}
