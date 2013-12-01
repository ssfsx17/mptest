package ssfsx17.mptest

/**
 * Created with IntelliJ IDEA.
 * User: ssfsx17
 * Date: 11/30/13
 * Time: 4:46 PM
 * To change this template use File | Settings | File Templates.
 */
class ChatMessage {
    String sender = "default user"
    Date date = new Date()
    String body = "default chat message"

    @Override
    public String toString() {
        return sender + " [" + date + "]: " + body
    }
}
