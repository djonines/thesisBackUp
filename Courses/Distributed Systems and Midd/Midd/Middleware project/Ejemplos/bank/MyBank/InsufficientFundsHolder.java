package MyBank;

/**
* MyBank/InsufficientFundsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Saturday, April 7, 2012 1:30:10 PM CEST
*/

public final class InsufficientFundsHolder implements org.omg.CORBA.portable.Streamable
{
  public MyBank.InsufficientFunds value = null;

  public InsufficientFundsHolder ()
  {
  }

  public InsufficientFundsHolder (MyBank.InsufficientFunds initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MyBank.InsufficientFundsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MyBank.InsufficientFundsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MyBank.InsufficientFundsHelper.type ();
  }

}
