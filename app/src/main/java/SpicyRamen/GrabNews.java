package SpicyRamen;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class GrabNews implements MessageCreateListener
{

    @Override
    public void onMessageCreate(MessageCreateEvent event) 
    {
        /*
            first want to make sure we can grab news articles at all
            
            "web scraping"
            https://www.webscrapingapi.com/java-web-scraping/ -- starter info
            https://stackabuse.com/web-scraping-the-java-way/ -- options for scraping apis, maven tutorial

        */
        if (event.getMessageContent().equalsIgnoreCase(".news")) // incoming: keywords
        {
            
        }
        
    }
    
}
