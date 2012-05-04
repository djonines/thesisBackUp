package MyBank;


/**
* MyBank/BankHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Saturday, April 7, 2012 1:30:10 PM CEST
*/

abstract public class BankHelper
{
  private static String  _id = "IDL:MyBank/Bank:1.0";

  public static void insert (org.omg.CORBA.Any a, MyBank.Bank that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MyBank.Bank extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (MyBank.BankHelper.id (), "Bank");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MyBank.Bank read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BankStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MyBank.Bank value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static MyBank.Bank narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MyBank.Bank)
      return (MyBank.Bank)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MyBank._BankStub stub = new MyBank._BankStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static MyBank.Bank unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MyBank.Bank)
      return (MyBank.Bank)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MyBank._BankStub stub = new MyBank._BankStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
