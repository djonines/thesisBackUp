package chat;


/**
* chat/ChatServerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Chat.idl
* Friday, April 6, 2012 6:43:18 PM CEST
*/

public interface ChatServerOperations 
{
  void addClient (chat.ChatClient client);
  void fwdMsg (String msg);
} // interface ChatServerOperations
