package chat;

/**
* chat/ChatClientHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Chat.idl
* Friday, April 6, 2012 6:43:18 PM CEST
*/

public final class ChatClientHolder implements org.omg.CORBA.portable.Streamable
{
  public chat.ChatClient value = null;

  public ChatClientHolder ()
  {
  }

  public ChatClientHolder (chat.ChatClient initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = chat.ChatClientHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    chat.ChatClientHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return chat.ChatClientHelper.type ();
  }

}
