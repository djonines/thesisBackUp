package MyBank;


/**
* MyBank/AccountDetails.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Saturday, April 7, 2012 1:30:10 PM CEST
*/

public final class AccountDetails implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String address = null;
  public int number = (int)0;
  public double balance = (double)0;

  public AccountDetails ()
  {
  } // ctor

  public AccountDetails (String _name, String _address, int _number, double _balance)
  {
    name = _name;
    address = _address;
    number = _number;
    balance = _balance;
  } // ctor

} // class AccountDetails