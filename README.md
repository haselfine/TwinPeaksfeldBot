#Twin Peaksfeld Bot
Created by Ben Haseltine
16 December 2019

This program sends a tweet to twitter.com/TwinPeaksfeld which contains a random quote from Seinfeld alongside 
a random picture from Twin Peaks.
It uses the Twitter4J Java library to interact with the Twitter API.

***In order to use this program, you will need me to send you a zip file containing 4 authorization keys.***

***You will need to add these into the "environment variables" field under "edit configuration" of the class TweetRandomizer.***

***When adding these environment variables, make sure there are no leading or trailing spaces for any of the keys. It will not work if there are any!***

Following is some of the work I did in order to get this project automated and tweeting regularly once an hour on my behalf.

First I created a Twitter developer account which required me to request authorization from Twitter to create my app/use their API.

Then, I needed to add the repository as well as the dependency of Twitter4J into the pom.xml. This enabled me to more easily
authorize the program to tweet on my behalf. It also creates objects to which I could add
my strings and pictures as well as methods which I could tell to send the tweet.

After I got the program itself to work, I needed to create an account with Heroku to host the program
and schedule it to run on a regular basis. After creating the account, I had to create an app on Heroku which would host the program.
Then I had to link the github repository for this program to that app. Then I needed to add more configurations to more easily tell Heroku to run the app.

Heroku requires a file called a Procfile to instruct it to run different processes of your app under different guises. A common
one is a "web" process, which would run a website for people to navigate. My program, however, needed a "worker" background process to
simply run the program without any user interaction.

I also needed to use a scheduler add-on in Heroku for it to run on a regular schedule, which required a command-line prompt to tell it what to run.
In order to make that command simpler and include the Twitter4J library, I added a Maven assembly plugin by Codehaus.Mojo which packaged
everything into the target file. That made it so I could give my main process the name "worker" and simply tell the command-line
"sh /src/bin/worker" to run everything.

Finally I needed to add my environment keys to Heroku under the settings tab since I did not include these in my github repository.

All in all, it runs well and I already have 4 followers.